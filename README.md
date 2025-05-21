# Skill Tracker

**Skill Tracker** is a simple console-based Java application that allows users to manage a list of skills along with their proficiency levels and last updated dates. The app supports adding, updating, deleting, and listing skills, as well as saving to and loading from a file.

---

## 📁 Project Structure

com/
└── skilltracker/
├── Main.java # Entry point of the application
├── Skill.java # Model class representing a skill
├── SkillManager.java # Business logic for managing skills
└── SkillLevel.java # Enum representing skill proficiency levels


---

## ✨ Features

- Add new skills with a name and proficiency level (Not Started, Beginner, Intermediate, Advanced)  
- List all existing skills  
- Update the proficiency level of a skill by its ID  
- Delete a skill by ID  
- Automatically save all skills to a file (`skills.txt`) after each change  
- Load skills from a file on startup  

---

## 🛠 How to Run

1. Clone the repository or copy the source code into your project directory.  
2. Compile the project using your terminal or preferred IDE.

### Using the terminal

```bash
javac com/skilltracker/*.java
java com.skilltracker.Main
📄 File Format: skills.txt
Skills are stored in a CSV-like format:
id,name,level,lastUpdated

Example:
1,Java,INTERMEDIATE,2025-05-20
2,SQL,BEGINNER,2025-05-19
⚙️ Requirements
Java 8 or higher

No external dependencies

👩‍💻 Author
Iryna Kravchenko


