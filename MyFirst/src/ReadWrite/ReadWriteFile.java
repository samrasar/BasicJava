package ReadWrite;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadWriteFile {
    public static void main(String[] args) {
        try {
            String path = "C:/intellijWorkspace/MyDemo/BasicJava/MyFirst/src/ReadWrite/myFile.txt";
            String content = Files.readString(Path.of(path));
            System.out.println(content);
            String newFilePath = "C:/intellijWorkspace/MyDemo/BasicJava/MyFirst/src/ReadWrite/output.txt";
            Files.writeString(Path.of(newFilePath), content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
