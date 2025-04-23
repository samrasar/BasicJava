package ReadWrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadWriteFile {
    public static void main(String[] args) {
        try {
            //Read from File
            String path = "C:/intellijWorkspace/MyDemo/BasicJava/MyFirst/src/ReadWrite/myFile.txt";
            String content = Files.readString(Path.of(path));
            System.out.println(content);

            // Read user input
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Text to write: ");
            String data = scanner.nextLine();
            System.out.println("You have entered: " + data);

            //Write to a file
            String newFilePath = "C:/intellijWorkspace/MyDemo/BasicJava/MyFirst/src/ReadWrite/output.txt";
            Files.writeString(Path.of(newFilePath), data);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
