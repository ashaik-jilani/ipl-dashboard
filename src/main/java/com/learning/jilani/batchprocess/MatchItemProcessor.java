/**
 * 
 */
package com.learning.jilani.batchprocess;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.learning.jilani.data.MatchInput;
import com.learning.jilani.model.Match;

/**
 * @author jilanishaik
 *
 */
public class MatchItemProcessor implements ItemProcessor<MatchInput, Match> {

	
	private static final Logger log = LoggerFactory.getLogger(MatchItemProcessor.class);
	
	@Override
	public Match process(MatchInput item) throws Exception {
		
		Match match=new Match();
		match.setId(Long.valueOf(item.getId()));
		match.setCity(item.getCity());
		match.setDate(LocalDate.parse(item.getDate()));
		match.setEliminator(item.getEliminator());
		
		match.setPlayerOfMatch(item.getPlayer_of_match());
		match.setVenue(item.getVenue());
		
		String firstInningsTeam, secondInningsTeam;
		
	if("bat".equalsIgnoreCase(item.getToss_decision())) {
		firstInningsTeam=item.getToss_winner();
		secondInningsTeam=item.getToss_winner().equals(item.getTeam1())?item.getTeam2():item.getTeam1();
	}else {
		secondInningsTeam=item.getToss_winner();
		firstInningsTeam=item.getToss_winner().equals(item.getTeam1())?item.getTeam2():item.getTeam1();
		
	}
	match.setTeam1(firstInningsTeam);
	match.setTeam2(secondInningsTeam);
		match.setMatchWinner(item.getWinner());
		match.setTossWinner(item.getToss_winner());
		match.setTossDecision(item.getToss_decision());
		match.setResult(item.getResult());
		match.setResultMargin(item.getResult_margin());
		match.setUmpire1(item.getUmpire1());
		match.setUmpire2(item.getUmpire2());
		match.setMethod(item.getMethod());
		
	    return match;
	}

}
