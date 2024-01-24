package A02AbstractionEx.E04TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] initialTrafficLightsStates = scan.nextLine().split("\\s+");
        int numberOfUpdate = Integer.parseInt(scan.nextLine());


        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String initialTrafficLightsState : initialTrafficLightsStates) {
            TrafficLight trafficLight = new TrafficLight(TrafficLightState.valueOf(initialTrafficLightsState));
            trafficLights.add(trafficLight);
        }

        for (int i = 0; i < numberOfUpdate; i++) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight + " ");
            }
            System.out.println();
        }
    }
}
