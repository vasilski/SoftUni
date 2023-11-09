package A10StreamsFilesAndDirectoriesEx;

import java.io.File;

public class E08GetFolderSize {
    public static void main(String[] args) {
        String input =
                "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\Exercises-Resources\\Exercises Resources";

        File file = new File(input);

        long size = 0;

        for (File innerFile : file.listFiles()) {
            size += innerFile.length();
        }

        System.out.println(size);
    }
}
