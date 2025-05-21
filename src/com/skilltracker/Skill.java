package com.skilltracker;

import java.time.LocalDate;

public class Skill {
    int id;
    String name;
    String level;
    LocalDate lastUpdated;

    public Skill(int id, String name, String level, LocalDate lastUpdated) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.lastUpdated = lastUpdated;


    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level='" + level + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
