package com.football.service.model;

public class StandingsResponse {

    private String countryId;
    private String countryName;
    private String leagueId;
    private String leagueName;
    private String teamId;
    private String teamName;
    private String position;

    public StandingsResponse(String countryId, String countryName, String leagueId, String leagueName,
                             String teamId, String teamName, String position) {
        this.countryId = countryId;
        this.countryName = countryName;
        this.leagueId = leagueId;
        this.leagueName = leagueName;
        this.teamId = teamId;
        this.teamName = teamName;
        this.position = position;
    }

    // Getters and setters
    public String getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getPosition() {
        return position;
    }
}
