Skill Tracker
Skill Tracker is a simple console-based Java application that allows users to manage a list of skills with their proficiency levels and last updated dates. It supports adding, updating, deleting, and listing skills, as well as saving to and loading from a file.

Project Structure
com/
└── skilltracker/
    ├── Main.java         # Entry point of the application
    ├── Skill.java        # Model class representing a skill
    └── SkillManager.java # Business logic for managing skills
Features
Add new skills with a name and proficiency level (Not started, Beginner, Intermediate, Advanced)

List all existing skills

Update the proficiency level of a skill by its ID

Delete a skill by ID

Save all skills to a file (skills.txt)

Load skills from a file on startup

How to Run
Clone the repository or copy the source code to your project.

Compile the project using a terminal or your preferred IDE.

Run Main.java.

Compilation via terminal:
javac com/skilltracker/*.java
java com.skilltracker.Main
File Format: skills.txt
The application stores skill data in a CSV-like format:


<id>,<skill name>,<level>,<last updated date>
Example:

1,Java,Intermediate,2025-05-20
2,SQL,Beginner,2025-05-19
Requirements
Java 8 or higher
No external dependencies

Author
Iryna Kravchenko
