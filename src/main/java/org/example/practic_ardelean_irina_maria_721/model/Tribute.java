package org.example.practic_ardelean_irina_maria_721.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Tribute {
    @JsonProperty("id")
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("distrikt")
    private int distrikt;

    @JsonProperty("status")
    private Status status;

    @JsonProperty("skillLevel")
    private int skillLevel;

    public Tribute(int id, String name, int distrikt, Status status, int skillLevel) {
        this.id = id;
        this.name = name;
        this.distrikt = distrikt;
        this.status = status;
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "Tribute{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", distrikt=" + distrikt +
                ", status=" + status +
                ", skillLevel=" + skillLevel +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDistrikt() {
        return distrikt;
    }

    public void setDistrikt(int distrikt) {
        this.distrikt = distrikt;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }
}
