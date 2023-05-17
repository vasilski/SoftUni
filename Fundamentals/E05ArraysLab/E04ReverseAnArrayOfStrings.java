package E05ArraysLab;

        import java.util.Scanner;

public class E04ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] stringsLine = scan.nextLine().split(" ");

        for (int i = 0; i <stringsLine.length / 2 ; i++) {
            String oldString = stringsLine[i];
            stringsLine[i] = stringsLine[stringsLine.length -1 - i];
            stringsLine[stringsLine.length -1 - i] = oldString;
        }
        System.out.println(String.join(" ", stringsLine));
        }
    }

