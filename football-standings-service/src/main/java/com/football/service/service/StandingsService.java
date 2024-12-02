package com.football.service.service;

import com.football.service.model.StandingsResponse;
import com.football.service.util.OfflineData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StandingsService {

    @Value("${offline.mode}")
    private boolean offlineMode;

    public StandingsResponse getStandings(String country, String league, String team) {
        if (offlineMode) {
            return OfflineData.getOfflineStandings(country, league, team)
                    .orElseThrow(() -> new RuntimeException("Data not found in offline mode"));
        }
      
        throw new UnsupportedOperationException("Online mode not implemented in this example.");
    }
}
