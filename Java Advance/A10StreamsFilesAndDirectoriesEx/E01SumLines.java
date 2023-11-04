package A10StreamsFilesAndDirectoriesEx;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class E01SumLines {
    public static void main(String[] args) throws IOException {
        FileInputStream inputPath = new FileInputStream(
                "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Exercises-Resources\\input.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputPath));

        String line = reader.readLine();

        while (line != null) {
            long sum = 0;
            for (char c : line.toCharArray()) {
                sum += c;
            }
            System.out.println(sum);
            line = reader.readLine();
        }

    }
}
