package com.example.project_management_system.service;

import com.example.project_management_system.model.Team;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TeamService {

    private final List<Team> teamList = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong(1);

    public List<Team> getAllTeams() {
        return teamList;
    }

    public Team createTeam(Team team) {
        team.setId(idCounter.getAndIncrement());
        teamList.add(team);
        return team;
    }
}

