package Task4;

import java.io.*;
import java.util.Scanner;

public class NotesApp {

    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n==== Notes App ====");
            System.out.println("1. Write a new note (Overwrite)");
            System.out.println("2. Append a note");
            System.out.println("3. View all notes");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    writeNotes(scanner, false);
                    break;
                case 2:
                    writeNotes(scanner, true);
                    break;
                case 3:
                    readNotes();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void writeNotes(Scanner scanner, boolean append) {
        System.out.println("Enter your note (type 'END' on a new line to finish):");

        try (FileWriter writer = new FileWriter(FILE_NAME, append)) {
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("Note saved successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    private static void readNotes() {
        System.out.println("\n--- Your Notes ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            boolean empty = true;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                empty = false;
            }
            if (empty) {
                System.out.println("(No notes found)");
            }
        } catch (FileNotFoundException e) {
            System.err.println("No notes file found. Please add some notes first.");
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
