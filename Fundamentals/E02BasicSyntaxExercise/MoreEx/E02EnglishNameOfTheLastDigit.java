package E02BasicSyntaxExercise.MoreEx;

import java.util.Scanner;

public class E02EnglishNameOfTheLastDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String digit = scan.nextLine();
        char c = digit.charAt(digit.length() - 1);

        englishNameNum(c);


    }

    private static void englishNameNum(char c) {
        switch (c) {
            case '1':
                System.out.println("one");
                break;
            case '2':
                System.out.println("two");
                break;
            case '3':
                System.out.println("three");
                break;
            case '4':
                System.out.println("for");
                break;
            case '5':
                System.out.println("five");
                break;
            case '6':
                System.out.println("six");
                break;
            case '7':
                System.out.println("seven");
                break;
            case '8':
                System.out.println("eight");
                break;
            case '9':
                System.out.println("nine");
                break;
            default:
                System.out.println("zero");
                break;

        }
    }
}
