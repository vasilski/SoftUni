package A13DefiningClassesd.E03BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<Integer, BankAccount> vault = new HashMap<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            String output = "";

            switch (tokens[0]) {
                case "Create":
                    BankAccount bankAccount = new BankAccount();
                    vault.put(bankAccount.getId(), bankAccount);
                    output = "Account ID"+ bankAccount.getId() +" created";
                    System.out.println(output);
                    break;
                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    if (vault.containsKey(id)) {
                        int amount = Integer.parseInt(tokens[2]);
                        vault.get(id).deposit(amount);
                        output = "Deposited " + amount + " to ID" + id;
                    } else {
                     output = "Account does not exist";
                    }
                    System.out.println(output);
                    break;
                case "SetInterest":
                    double newInterest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(newInterest);
                    break;
                case "GetInterest":
                    id = Integer.parseInt(tokens[1]);
                    if (vault.containsKey(id)) {
                    int years = Integer.parseInt(tokens[2]);
                    double interest = vault.get(id).getInterest(years);
                    output = String.format("%.2f", interest);
                    } else {
                        output = "Account does not exist";
                    }
                    System.out.println(output);
                    break;

            }



            input = scan.nextLine();
        }

    }
}
