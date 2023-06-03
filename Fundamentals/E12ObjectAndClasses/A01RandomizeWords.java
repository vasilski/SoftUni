package E12ObjectAndClasses;

        import java.util.Random;
        import java.util.Scanner;

public class A01RandomizeWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split("\\s+");

        Random rnd = new Random();

        for (int i = 0; i < words.length - 1; i++) {
            int number = rnd.nextInt(words.length);
            System.out.println(words[number]);
        }
    }
}
