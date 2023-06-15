package E18TextProccessing;

import java.util.Scanner;

public class E03Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String keyWord = scan.nextLine();
        String text = scan.nextLine();

        while (text.contains(keyWord)) {
            text = text.replaceAll(keyWord, "");
        }
        System.out.println(text);
    }
}
