/**
 * 
 */
package com.learning.jilani.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author jilanishaik
 *
 */
@Entity
public class Match {
	@Id
	private long	id;
	private String	city;
	private LocalDate	date;
	private String	playerOfMatch;
	private String	venue;
	private String	team1;
	private String	team2;
	private String	tossWinner;
	private String	tossDecision;
	private String	matchWinner;
	private String	result;
	private String	resultMargin;
	private String	eliminator;
	private String	method;
	private String	umpire1;
	private String	umpire2;
	
	/**
	 * @return the umpire1
	 */
	public String getUmpire1() {
		return umpire1;
	}
	/**
	 * @param umpire1 the umpire1 to set
	 */
	public void setUmpire1(String umpire1) {
		this.umpire1 = umpire1;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @return the playerOfMatch
	 */
	public String getPlayerOfMatch() {
		return playerOfMatch;
	}
	/**
	 * @param playerOfMatch the playerOfMatch to set
	 */
	public void setPlayerOfMatch(String playerOfMatch) {
		this.playerOfMatch = playerOfMatch;
	}
	/**
	 * @return the venue
	 */
	public String getVenue() {
		return venue;
	}
	/**
	 * @param venue the venue to set
	 */
	public void setVenue(String venue) {
		this.venue = venue;
	}
	/**
	 * @return the team1
	 */
	public String getTeam1() {
		return team1;
	}
	/**
	 * @param team1 the team1 to set
	 */
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	/**
	 * @return the team2
	 */
	public String getTeam2() {
		return team2;
	}
	/**
	 * @param team2 the team2 to set
	 */
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	/**
	 * @return the tossWinner
	 */
	public String getTossWinner() {
		return tossWinner;
	}
	/**
	 * @param tossWinner the tossWinner to set
	 */
	public void setTossWinner(String tossWinner) {
		this.tossWinner = tossWinner;
	}
	/**
	 * @return the tossDecision
	 */
	public String getTossDecision() {
		return tossDecision;
	}
	/**
	 * @param tossDecision the tossDecision to set
	 */
	public void setTossDecision(String tossDecision) {
		this.tossDecision = tossDecision;
	}
	/**
	 * @return the matchWinner
	 */
	public String getMatchWinner() {
		return matchWinner;
	}
	/**
	 * @param matchWinner the matchWinner to set
	 */
	public void setMatchWinner(String matchWinner) {
		this.matchWinner = matchWinner;
	}
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @return the resultMargin
	 */
	public String getResultMargin() {
		return resultMargin;
	}
	/**
	 * @param resultMargin the resultMargin to set
	 */
	public void setResultMargin(String resultMargin) {
		this.resultMargin = resultMargin;
	}
	/**
	 * @return the eliminator
	 */
	public String getEliminator() {
		return eliminator;
	}
	/**
	 * @param eliminator the eliminator to set
	 */
	public void setEliminator(String eliminator) {
		this.eliminator = eliminator;
	}
	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}
	/**
	 * @param method the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}
	/**
	 * @return the umpire2
	 */
	public String getUmpire2() {
		return umpire2;
	}
	/**
	 * @param umpire2 the umpire2 to set
	 */
	public void setUmpire2(String umpire2) {
		this.umpire2 = umpire2;
	}

}
