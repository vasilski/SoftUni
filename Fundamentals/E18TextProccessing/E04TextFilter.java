import java.util.Scanner;

public class E04TextFilter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] keyWord = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (int i = 0; i < keyWord.length; i++) {
            String replays = keyWord[i];
            String wordOfStars = "";
            for (int k = 0; k < replays.length(); k++) {
                wordOfStars += "*";
            }

            text = text.replaceAll(keyWord[i], wordOfStars);

        }

        System.out.println(text);
    }
}
