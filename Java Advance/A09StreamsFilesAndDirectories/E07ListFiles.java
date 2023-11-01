package A09StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;

public class E07ListFiles {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources ";

        File file = new File(fileName);

        File[] innerFiles = file.listFiles();
        for (File innerFile : innerFiles) {
            if (!innerFile.isDirectory()) {
                System.out.printf("%s: [%d]%n",innerFile.getName(), innerFile.length());
            }
        }
    }
}
