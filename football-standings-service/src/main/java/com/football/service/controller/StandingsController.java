package com.football.service.controller;

import com.football.service.model.StandingsResponse;
import com.football.service.service.StandingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/standings")
public class StandingsController {

    @Autowired
    private StandingsService standingsService;

    @GetMapping
    public StandingsResponse getStandings(
            @RequestParam String country,
            @RequestParam String league,
            @RequestParam String team) {
        return standingsService.getStandings(country, league, team);
    }
}
