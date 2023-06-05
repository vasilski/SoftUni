package E13ObjectsAndClasses.articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        List<Articles> articles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scan.nextLine().split(", ");
            Articles article = new Articles(data[0],data[1],data[2]);
            articles.add(article);
        }
        switch (scan.nextLine()){
            case "title":
                articles.stream().sorted(Comparator.comparing(Articles::getTitle)).forEach(e-> System.out.println(e.toString()));
                break;
            case "content":
                articles.stream().sorted(Comparator.comparing(Articles::getContent)).forEach(e-> System.out.println(e.toString()));
                break;
            case "author":
                articles.stream().sorted(Comparator.comparing(Articles::getAuthor)).forEach(e-> System.out.println(e.toString()));
                break;
        }
    }
}
