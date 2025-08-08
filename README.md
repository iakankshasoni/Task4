# Task4
Built a Java Notes App using File I/O
```
# 📝 Java Notes App (File I/O)

A simple **text-based notes manager** built in Java using `FileReader`, `FileWriter`, and `BufferedReader`.  
This project demonstrates **Java File I/O** operations, exception handling, and menu-driven programs.

---

## 🚀 Features
- Create a new note (overwrite existing content)
- Append new notes without losing old ones
- View all saved notes
- Simple terminal-based menu
- Uses **try-with-resources** for safe file handling

---

## 🛠 Technologies Used
- Java
- FileWriter & FileReader
- BufferedReader
- Exception Handling (`IOException`, `FileNotFoundException`)

---

## 📂 File Structure
NotesApp.java # Main program file
notes.txt # File to store notes (auto-created)
README.md # Project documentation

yaml
Copy
Edit

---

## 📸 Screenshot
*(Sample terminal output)*
==== Notes App ====

Write a new note (Overwrite)

Append a note

View all notes

Exit
Enter your choice: 2
Enter your note (type 'END' on a new line to finish):
This is my first note.
END
Note saved successfully!

yaml
Copy
Edit

---

## ▶️ How to Run
1. Clone this repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/java-notes-app.git
Navigate into the folder:

bash
Copy
Edit
cd java-notes-app
Compile the Java file:

bash
Copy
Edit
javac NotesApp.java
Run the program:

bash
Copy
Edit
java NotesApp
