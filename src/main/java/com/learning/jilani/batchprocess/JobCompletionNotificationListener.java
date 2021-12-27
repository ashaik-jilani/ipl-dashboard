/**
 * 
 */
package com.learning.jilani.batchprocess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
 import com.learning.jilani.model.Team;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * @author jilanishaik
 *
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

  private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

  private final EntityManager eManager;

  @Autowired
  public JobCompletionNotificationListener(EntityManager eManager) {
    this.eManager = eManager;
  }

  @Override
  @Transactional
  public void afterJob(JobExecution jobExecution) {
    if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
      log.info("!!! JOB FINISHED! Time to verify the results");

      Map<String, Team> teamData=new HashMap<>();

      eManager.createQuery("select m.team1, count(*) from Match m group by m.team1", Object[].class)
      .getResultList().stream()
      .map(eManager -> new Team((String) eManager[0], (long) eManager[1]))
      .forEach(team -> teamData.put(team.getTeamName(), team));

      eManager.createQuery("select m.team2, count(*) from Match m group by m.team2", Object[].class)
      .getResultList()
      .stream()
      .forEach( eManager ->{
        Team team= teamData.get((String)eManager[0]);
        team.setTotalMatches(team.getTotalMatches()+(long) eManager[1]);
      });

        eManager.createQuery("select m.matchWinner, count(*) from Match m group by m.matchWinner", Object[].class)
      .getResultList()
      .stream()
      .forEach( eManager ->{
        Team team= teamData.get((String)eManager[0]);
        if(team!=null) team.setTotalWins((long) eManager[1]);
      });

        teamData.values().forEach(team -> eManager.persist(team));




      

    }
  }
}