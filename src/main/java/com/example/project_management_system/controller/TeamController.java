package com.example.project_management_system.controller;

import com.example.project_management_system.model.Team;
import com.example.project_management_system.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/teams")
public class TeamController {

    @Autowired
    TeamService teamService;

    @GetMapping
    public List<Team> List() {
        return teamService.getAllTeams();
    }

    // POST /api/teams
    @PostMapping
    public Team createTeam(@RequestBody Team team) {
        return teamService.createTeam(team);
    }
}

