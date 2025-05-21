package com.skilltracker;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class SkillManager {
    Map<Integer, Skill> skills = new HashMap<>();
    int nextId = 1;

    public void addSkill(String name, String level) {
        Skill newSkill = new Skill(nextId, name, level, LocalDate.now());
        skills.put(nextId, newSkill);
        System.out.println("Skill added: " + newSkill.getName());
        nextId++;
    }

    public void listSkills() {
        if (skills.isEmpty()) {
            System.out.println("No skills in the tracker yet.");
        } else {
            for (Skill skill : skills.values()) {
                System.out.println(skill);
            }
        }
    }

    public void updateSkill(int id, String newLevel) {
        Skill skill = skills.get(id);
        if(skill != null) {
            skill.setLevel(newLevel);
            skill.setLastUpdated(LocalDate.now());
            System.out.println("Skill updated : " + skill.getName()
            + " → " + newLevel);
        } else {
            System.out.println("Skill with ID " + id + " not found.");
        }
    }

    public void deleteSkill(int id) {
        Skill removed = skills.remove(id);
        if (removed != null) {
            System.out.println("Deleted skill: " + removed.getName());
        } else {
            System.out.println("Skill with ID: " + id + " not found.");
        }
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Skill skill : skills.values()) {
                writer.write(skill.getId() + "," + skill.getName() + "," + skill.getLevel() + "," + skill.getLastUpdated());
                writer.newLine();
            }
            System.out.println("Skills saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("Error while saving skills: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String level = parts[2];
                    LocalDate date = LocalDate.parse(parts[3]);
                    skills.put(id, new Skill(id, name, level, date));
                    nextId = Math.max(nextId, id + 1);
                }
            }
            System.out.println("Skills loaded from file: " + filename);
        } catch (IOException e) {
            System.out.println("Error while loading skills: " + e.getMessage());
        }
    }
}
