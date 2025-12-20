import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandlingTasks {

    public static void main(String[] args) throws Exception {

        // Task 1: Create File
        File file = new File("data.txt");

        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
        // Task 2: Write data using FileWriter
        FileWriter writer = new FileWriter(file);
        writer.write("Name: Rohit\n");
        writer.write("Age: 25\n");
        writer.write("City: Delhi\n");
        writer.close();

        System.out.println("Data written using FileWriter.");

        // Task 3: Read data using FileReader
        FileReader reader = new FileReader(file);
        int ch;

        System.out.println("\nReading file character by character:");
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();

        // Task 4: BufferedWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("Line 1: Java");
        bw.newLine();
        bw.write("Line 2: File Handling");
        bw.newLine();
        bw.write("Line 3: BufferedWriter");
        bw.newLine();
        bw.write("Line 4: BufferedReader");
        bw.newLine();
        bw.write("Line 5: Completed");
        bw.close();

        System.out.println("\n5 lines written using BufferedWriter.");

        // BufferedReader
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        System.out.println("\nReading file line by line:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
