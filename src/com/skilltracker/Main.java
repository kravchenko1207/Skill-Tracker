package com.skilltracker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SkillManager manager = new SkillManager();
        Scanner scanner = new Scanner(System.in);

        manager.loadFromFile("skills.txt");
        boolean running = true;

        while (running) {
            System.out.println("\n=== Skill Tracker ===");
            System.out.println("1. Add Skill");
            System.out.println("2. List Skills");
            System.out.println("3. Update Skill");
            System.out.println("4. Delete Skill");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.println("Enter skill name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter level (Not started / Beginner / Intermediate / Advanced): ");
                    String level = scanner.nextLine();
                    manager.addSkill(name, level);
                    break;

                case "2":
                    manager.listSkills();
                    break;

                case "3":
                    System.out.println("Enter skill ID to update: ");
                    int updateID = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter new level: ");
                    String newLevel = scanner.nextLine();
                    manager.updateSkill(updateID, newLevel);
                    break;

                case "4":
                    System.out.println("Enter skill ID to delete: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    manager.deleteSkill(deleteId);
                    break;

                case "5":
                    manager.saveToFile("skills.txt");
                    running = false;
                    System.out.println("Exiting Skill Tracker. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-5.");

            }
        }
        scanner.close();
    }
}
