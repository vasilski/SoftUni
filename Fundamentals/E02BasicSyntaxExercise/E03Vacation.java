package E02BasicSyntaxExercise;

import java.util.Scanner;

public class E03Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int totalPeople = Integer.parseInt(scan.nextLine());
        String people = scan.nextLine();
        String dayOfWeek = scan.nextLine();
        double totalSum = 0;

        switch (dayOfWeek) {
            case "Friday":
                if ("Students".equals(people)) {
                    if (totalPeople >= 30) {
                        totalSum += totalPeople * 8.45;
                        System.out.printf("Total price: %.2f", totalSum * 0.85);
                    } else {
                        totalSum += totalPeople * 8.45;
                        System.out.printf("Total price: %.2f", totalSum);
                    }
                } else if ("Business".equals(people)) {
                    if (totalPeople >= 100) {
                        totalSum += totalPeople * 10.90;
                        System.out.printf("Total price: %.2f", totalSum - 109);
                    } else {
                        totalSum += totalPeople * 10.90;
                        System.out.printf("Total price: %.2f", totalSum);
                    }
                } else if ("Regular".equals(people)) {
                    if (totalPeople >= 10 && totalPeople <= 20) {
                        totalSum += totalPeople * 15;
                        System.out.printf("Total price: %.2f", totalSum * 0.95);
                    } else {
                        totalSum += totalPeople * 15;
                        System.out.printf("Total price: %.2f", totalSum);
                    }
                }
                break;
            case "Saturday":
                if ("Students".equals(people)) {
                    if (totalPeople >= 30) {
                        totalSum += totalPeople * 9.8;
                        System.out.printf("Total price: %.2f", totalSum * 0.85);
                    } else {
                        totalSum += totalPeople * 9.8;
                        System.out.printf("Total price: %.2f", totalSum);
                    }
                } else if ("Business".equals(people)) {
                    if (totalPeople >= 100) {
                        totalSum += totalPeople * 15.6;
                        System.out.printf("Total price: %.2f", totalSum - 156);
                    } else {
                        totalSum += totalPeople * 15.6;
                        System.out.printf("Total price: %.2f", totalSum);
                    }
                } else if ("Regular".equals(people)) {
                    if (totalPeople >= 10 && totalPeople <= 20) {
                        totalSum += totalPeople * 20;
                        System.out.printf("Total price: %.2f", totalSum * 0.95);
                    } else {
                        totalSum += totalPeople * 20;
                        System.out.printf("Total price: %.2f", totalSum);
                    }
                }
                break;
            case "Sunday":
                if ("Students".equals(people)) {
                    if (totalPeople >= 30) {
                        totalSum += totalPeople * 10.46;
                        System.out.printf("Total price: %.2f", totalSum * 0.85);
                    } else {
                        totalSum += totalPeople * 10.46;
                        System.out.printf("Total price: %.2f", totalSum);
                    }
                } else if ("Business".equals(people)) {
                    if (totalPeople >= 100) {
                        totalSum += totalPeople * 16;
                        System.out.printf("Total price: %.2f", totalSum - 160);
                    } else {
                        totalSum += totalPeople * 16;
                        System.out.printf("Total price: %.2f", totalSum);
                    }
                } else if ("Regular".equals(people)) {
                    if (totalPeople >= 10 && totalPeople <= 20) {
                        totalSum += totalPeople * 22.5;
                        System.out.printf("Total price: %.2f", totalSum * 0.95);
                    } else {
                        totalSum += totalPeople * 22.5;
                        System.out.printf("Total price: %.2f", totalSum);
                    }
                }
                break;
        }
    }
}
