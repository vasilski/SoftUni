package E04DataTypesExercise;

import java.util.Scanner;

public class E11Snowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int snowballs = Integer.parseInt(scan.nextLine());

        double snowballSnowBest = 0;
        double snowballTimeBest = 0;
        double snowballQualityBest = 0;
        double snowballValueBest = 0;

        for (int i = 0; i < snowballs; i++) {

            double snowballSnow = Double.parseDouble(scan.nextLine());
            double snowballTime = Double.parseDouble(scan.nextLine());
            double snowballQuality = Double.parseDouble(scan.nextLine());

            double snowballValue = Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > snowballValueBest) {
                snowballValueBest = snowballValue;
                snowballSnowBest = snowballSnow;
                snowballTimeBest = snowballTime;
                snowballQualityBest = snowballQuality;

            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)",snowballSnowBest, snowballTimeBest, snowballValueBest, snowballQualityBest);
    }
}
