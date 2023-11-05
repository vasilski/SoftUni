package A10StreamsFilesAndDirectoriesEx;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class E02SumBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream inputPath = new FileInputStream(
                "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Exercises-Resources\\input.txt");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputPath));

        String line = reader.readLine();
        BigInteger sum = new BigInteger("0");

        while (line != null) {
            for (char c : line.toCharArray()) {
                sum = sum.add(BigInteger.valueOf(c));
            }
            line = reader.readLine();
        }
        System.out.println(sum);

    }
}
