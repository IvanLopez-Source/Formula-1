package org.example.mappers;

import org.example.dtos.TeamRequest;
import org.example.dtos.TeamResponse;
import org.example.entities.Team;

public class TeamMapper {

    // Método fromRequest que convierte TeamRequest a Team
    public static Team fromRequest(TeamRequest teamRequest) {
        return new Team(
                teamRequest.name(),  // Asumimos que Team tiene un campo 'name' y 'description'
                teamRequest.country()
        );
    }

    // Método toResponse que convierte Team a TeamResponse
    public static TeamResponse toResponse(Team team) {
        return new TeamResponse(
                team.getId(),
                team.getName(),
                team.getCountry()

        );
    }
}
