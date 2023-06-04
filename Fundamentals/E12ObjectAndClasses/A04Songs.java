package E12ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A04Songs {

    public static class Song {
        private String typeList;
        private String name;
        private String time;


        public Song() {
        }

        public String getTypeList() {
            return typeList;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numSongs = Integer.parseInt(scan .nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i <numSongs ; i++) {
            String[] data = scan.nextLine().split("_");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();
            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);

            songs.add(song);
        }
        String typeList = scan.nextLine();

        if ("all".equalsIgnoreCase(typeList)) {
            for (Song song : songs) {
                System.out.println(song.getName());
            }
        } else {
            for (Song song : songs) {
                if (typeList.equalsIgnoreCase(song.getTypeList())) {
                    System.out.println(song.getName());
                }
            }
        }
    }
}
