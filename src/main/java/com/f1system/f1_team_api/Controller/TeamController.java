package com.f1system.f1_team_api.Controller;

import com.f1system.f1_team_api.Service.TeamService;
import com.f1system.f1_team_api.model.Team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {

    @Autowired
    private TeamService teamService;

    @GetMapping("/api/teams")
    public List<Team> getAllTeams() {
        return teamService.getAllTeams();
    }

    @GetMapping("/api/teams/{id}")
    public Team getTeam(@PathVariable int id) {
        return teamService.getTeam(id);
    }

    @PostMapping("/api/teams")
    public Team insertTeam(@RequestBody Team team) {
        return teamService.insertTeam(team);
    }

    @PutMapping("/api/teams/{id}")
    public Team updateTeam(@RequestBody Team team) {
        return teamService.updateTeam(team);
    }

    @DeleteMapping("/api/teams/{id}")
    public void deleteTeam(@PathVariable int id) {
        teamService.deleteTeam(id);
    }
}
