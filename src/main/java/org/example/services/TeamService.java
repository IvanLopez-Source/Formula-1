package org.example.services;

import org.example.dtos.TeamRequest;
import org.example.dtos.TeamResponse;

import org.example.entities.Team;
import org.example.mappers.CarMapper;
import org.example.mappers.TeamMapper;
import org.example.repositories.TeamRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {

    private final TeamRepository teamRepository;

    public TeamService(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }
/*
    public TeamResponse createTeam(TeamRequest teamRequest) {
        Team team = new Team(teamRequest.getName(), teamRequest.getCountry());
        Team savedTeam = teamsRepository.save(team);
        return TeamMapper.toResponse(savedTeam);
    }
*/
    public TeamResponse createTeam(TeamRequest teamRequest) {
        Team team = TeamMapper.fromRequest(teamRequest);
        Team savedTeam = teamRepository.save(team);
        return TeamMapper.toResponse(savedTeam);
    }

    public List<TeamResponse> getAllTeams() {
        List<Team> teamsList = teamRepository.findAll();
        return teamsList.stream()
                .map(TeamMapper::toResponse)
                .toList();
    }

    public TeamResponse findTeamById(Long id) {
        Team team = teamRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Team not found"));
        return TeamMapper.toResponse(team);
    }

    public void deleteTeam(Long id) {
        if (!teamRepository.existsById(id)) {
            throw new IllegalArgumentException("Team not found");
        }
        teamRepository.deleteById(id);
    }
}
