package A10StreamsFilesAndDirectoriesEx;

import java.io.*;

public class E04CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Exercises-Resources\\input.txt";

        BufferedReader reader = new BufferedReader(new FileReader(path));

       // BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt"));

        String line = reader.readLine();
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        while (line != null) {
            for (char c : line.toCharArray()) {
                if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o' || c == 'u') {
                    vowels++;
                } else if (c == '!' || c == ','|| c == '.'|| c == '?') {
                    punctuation++;
                } else if(c != ' '){
                    consonants++;
                }
            }

            line = reader.readLine();
        }
       // writer.close();

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Punctuation: " + punctuation);
    }
}
