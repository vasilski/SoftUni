package A10StreamsFilesAndDirectoriesEx;

import java.io.*;

public class E05LineNumbers {
    public static void main(String[] args) throws IOException {
        FileInputStream inputPath = new FileInputStream(
                "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Exercises-Resources\\inputLineNumbers.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputPath));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String line = reader.readLine();
        int numLine = 1;

        while (line != null) {

            writer.write(String.valueOf(numLine) + ". " + line);
            writer.write(System.lineSeparator());
            numLine++;
            line = reader.readLine();
        }
        writer.flush();
        writer.close();

        reader.close();
    }
}
