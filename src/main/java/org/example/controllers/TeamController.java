package org.example.controllers;

import org.example.dtos.TeamRequest;
import org.example.dtos.TeamResponse;
import org.example.services.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teams")
public class TeamController {

    private final TeamService teamsService;

    public TeamController(TeamService teamsService) {
        this.teamsService = teamsService;
    }

    @PostMapping
    public ResponseEntity<TeamResponse> createTeam(@RequestBody TeamRequest teamsRequest) {
        TeamResponse teamsResponse = teamsService.createTeam(teamsRequest);
        return ResponseEntity.ok(teamsResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeamResponse> getTeamById(@PathVariable Long id) {
        TeamResponse teamsResponse = teamsService.findTeamById(id);
        return ResponseEntity.ok(teamsResponse);
    }

    @GetMapping
    public List<TeamResponse> getAllTeams() {
        return teamsService.getAllTeams();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeam(@PathVariable Long id) {
        teamsService.deleteTeam(id);
        return ResponseEntity.noContent().build();
    }
}
