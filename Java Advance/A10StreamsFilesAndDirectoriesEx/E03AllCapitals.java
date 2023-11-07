package A10StreamsFilesAndDirectoriesEx;

import java.io.*;
import java.util.Locale;

public class E03AllCapitals {
    public static void main(String[] args) throws IOException{
        FileInputStream inputPath = new FileInputStream(
                "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Exercises-Resources\\input.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputPath));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

        String line = reader.readLine();


        while (line != null) {

            writer.write(line.toUpperCase(Locale.ROOT));
            writer.write(System.lineSeparator());

            line = reader.readLine();
        }
        writer.flush();
        writer.close();

        reader.close();
    }
}
