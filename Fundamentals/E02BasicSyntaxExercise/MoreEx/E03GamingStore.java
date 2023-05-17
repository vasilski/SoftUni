package E02BasicSyntaxExercise.MoreEx;

import java.util.Scanner;

public class E03GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double money = Double.parseDouble(scan.nextLine());
        String command = scan.nextLine();
        double spendMoneyGame = 0;

        while (!"Game Time".equals(command)) {
            double gamePrice;
            double bill = 0;
            switch (command) {
                case "OutFall 4":
                    gamePrice = 39.99;
                    bill += checkMoney(gamePrice, command, money);
                    spendMoneyGame += bill;
                    money -= bill;
                    break;
                case "CS: OG":
                    gamePrice = 15.99;
                    bill += checkMoney(gamePrice, command, money);
                    spendMoneyGame += bill;
                    money -= bill;
                    break;
                case "Zplinter Zell":
                    gamePrice = 19.99;
                    bill += checkMoney(gamePrice, command, money);
                    spendMoneyGame += bill;
                    money -= bill;
                    break;
                case "Honored 2":
                    gamePrice = 59.99;
                    bill += checkMoney(gamePrice, command, money);
                    spendMoneyGame += bill;
                    money -= bill;
                    break;
                case "RoverWatch":
                    gamePrice = 29.99;
                    bill += checkMoney(gamePrice, command, money);
                    spendMoneyGame += bill;
                    money -= bill;
                    break;
                case "RoverWatch Origins Edition":
                    gamePrice = 39.99;
                    bill +=  checkMoney(gamePrice, command, money);
                    spendMoneyGame += bill;
                    money -= bill;
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            command = scan.nextLine();
        }
        if (money == 0.0) {
            System.out.println("Out of mo-ney!");
        } else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", spendMoneyGame, money);
        }
    }

    static double checkMoney(double gamePrice, String command, double money1) {
        if (gamePrice > money1) {
            System.out.println("Too Expensive");
        } else if (money1 <= 0){
            System.out.println("Out of money!");
        } else {
            System.out.printf("Bought " + command);
            System.out.println();
            return gamePrice;
        }
        return 0;
    }
}
