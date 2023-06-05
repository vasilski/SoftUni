package E13ObjectsAndClasses.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] articleInfo = scan.nextLine().split(", ");
        String title = articleInfo[0];
        String content = articleInfo[1];
        String author = articleInfo[2];

        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <n ; i++) {
            String[] tokens = scan.nextLine().split(": ");
            String command = tokens[0];

            switch (command) {
                case "Edit":
                    article.edit(tokens[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(tokens[1]);
                    break;
                case "Rename":
                    article.rename(tokens[1]);
                    break;

            }
        }
        System.out.println(article);
    }
}
