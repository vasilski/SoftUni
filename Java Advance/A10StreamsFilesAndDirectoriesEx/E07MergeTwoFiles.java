package A10StreamsFilesAndDirectoriesEx;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class E07MergeTwoFiles {
    public static void main(String[] args) throws IOException {

        String inputOne =
                "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Exercises-Resources\\inputOne.txt";
        String inputTwo =
                "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Exercises-Resources\\inputTwo.txt";

        Scanner scan = new Scanner(new File(inputOne));

        PrintWriter writer = new PrintWriter("MergeOutput.txt");

        while (scan.hasNext()) {
            String line = scan.nextLine();
            writer.append(line).append(System.lineSeparator());
        }

        scan = new Scanner(new File(inputTwo));

        while (scan.hasNext()) {
            String line = scan.nextLine();
            writer.append(line).append(System.lineSeparator());
        }
        writer.close();
    }
}
