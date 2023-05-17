package E02BasicSyntaxExercise;

import java.util.Scanner;

public class E09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amount = Double.parseDouble(scan.nextLine());
        int student = Integer.parseInt(scan.nextLine());
        double lightsabersPrice = Double.parseDouble(scan.nextLine());
        double robesPrice = Double.parseDouble(scan.nextLine());
        double beltsPrice = Double.parseDouble(scan.nextLine());
        double studentOFDiscounts = 0;
        double lightsStudent = Math.ceil(student * 1.1);

        if (student > 5) {
            int discount = student / 6;
            studentOFDiscounts = student - discount;
        } else {
            studentOFDiscounts = student;
        }

        double needMoney = ((lightsabersPrice * lightsStudent) + (robesPrice * student) + (beltsPrice * studentOFDiscounts));

        if (needMoney > amount) {
            System.out.printf("Ivan Cho will need %.2flv more.", needMoney - amount);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", needMoney);
        }
    }
}
