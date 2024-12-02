package com.football.service.util;

import com.football.service.model.StandingsResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OfflineData {

    private static final List<StandingsResponse> STANDINGS = new ArrayList<>();

    static {
        STANDINGS.add(new StandingsResponse("1", "England", "101", "Premier League",
                "1001", "Manchester United", "5"));
    }

    public static Optional<StandingsResponse> getOfflineStandings(String country, String league, String team) {
        return STANDINGS.stream()
                .filter(s -> s.getCountryName().equalsIgnoreCase(country)
                        && s.getLeagueName().equalsIgnoreCase(league)
                        && s.getTeamName().equalsIgnoreCase(team))
                .findFirst();
    }
}
