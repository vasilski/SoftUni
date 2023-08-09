package A08SetAndMapAdvanceEx;

import java.util.*;

public class E07HandsOfCards {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Map<String, Set<String>> players = new LinkedHashMap<>();

        while (!"joker".equalsIgnoreCase(input)) {
            String[] token = input.split(": ");
            String name = token[0];
            String cards = token[1];

            Set<String> handsOfCards = new HashSet<>(Arrays.asList(cards.split(", ")));

            players.putIfAbsent(name, new HashSet<>());
            players.get(name).addAll(handsOfCards);

            input = scan.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : players.entrySet()) {
            int totalPoint = calculate(entry.getValue());
            System.out.printf("%s: %d%n",entry.getKey(), totalPoint);
        }
    }

    private static int calculate(Set<String> handsOfCards) {
        int hands = 0;
        for (String handsOfCard : handsOfCards) {

                  int num = 0;
            String card = handsOfCard;
            if (card.length() > 2) {
                num = 10;
                char typeCard = card.charAt(card.length() - 1);
                hands += calculatePowerCard(num, typeCard);

            } else {
                String powerCard = card.substring(0, 1);
                switch (powerCard) {
                    case "J":
                        num = 11;
                        break;
                    case "Q":
                        num = 12;
                        break;
                    case "K":
                        num = 13;
                        break;
                    case "A":
                        num = 14;
                        break;
                    default:
                        num = Integer.parseInt(powerCard);
                }

                char typeCard = card.charAt(card.length() - 1);
                hands += calculatePowerCard(num, typeCard);
            }
        }


        return hands;
    }

    private static int calculatePowerCard(int num, char typeCard) {
        int total = 0;
        switch (typeCard) {
            case 'S':
                total = num * 4;
                break;
            case 'H':
                total = num * 3;
                break;
            case 'D':
                total = num * 2;
                break;
            case 'C':
                total = num;
                break;
        }

        return total;
    }
}
