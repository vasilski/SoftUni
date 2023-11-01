package A09StreamsFilesAndDirectories;

import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Objects;

public class E08NestedFolders {

    public static int foldersCount = 0;

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\vasil\\OneDrive\\Desktop\\04. Java-Advanced-Streams-Files-and-Directories-Resources";

        File file = new File(fileName);

        Deque<File> dirs = new ArrayDeque<>();
        dirs.offer(file);

        int count = 0;
        while (!dirs.isEmpty()) {

            File current = dirs.poll();
            Arrays.stream(Objects.requireNonNull(current.listFiles()))
                    .filter(File::isDirectory)
                    .forEach(dirs::offer);

            count++;
            System.out.println(current.getName());
        }
        System.out.println(count + " folders");

    }

}
