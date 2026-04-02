package com.f1system.f1_team_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "teams")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Integer teamId;

    @Column(name = "team_name")
    private String teamName;

    @Column(name = "principal")
    private String principal;

    @Column(name = "headquarters")
    private String headQuarters;

    @Column(name = "founded_year")
    private Integer foundedYear;

    // Constructor with all fields
    public Team(Integer teamId, String teamName, String principal, String headQuarters, Integer foundedYear) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.principal = principal;
        this.headQuarters = headQuarters;
        this.foundedYear = foundedYear;
    }

    // Default constructor
    public Team() {
    }
    // Getters and Setters
    public Integer getTeamId() { return teamId; }
    public void setTeamId(Integer teamId) { this.teamId = teamId; }

    public String getTeamName() { return teamName; }
    public void setTeamName(String teamName) { this.teamName = teamName; }

    public String getPrincipal() { return principal; }
    public void setPrincipal(String principal) { this.principal = principal; }

    public String getHeadQuarters() { return headQuarters; }
    public void setHeadQuarters(String headQuarters) { this.headQuarters = headQuarters; }

    public Integer getFoundedYear() { return foundedYear; }
    public void setFoundedYear(Integer foundedYear) { this.foundedYear = foundedYear; }
}
