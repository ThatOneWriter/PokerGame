import java.util.Arrays;
import java.util.ArrayList;

public class Poker {

    private static String handType;


    public static boolean fiveOfAKind(int[] numbers) {
        if (numbers.size() < 5) {
            return false;
        }

        int num = numbers.get(0);
        for (int i = 0; i < 5; i++)
        {
            if (numbers.get(i) != num) {
                return false;
            }
        }
        return true;
    }

    public static boolean fourOfAKind(int[] numbers) {
        if (numbers.size() < 5) {
            return false;
        }

        

        if (numbers[0] == numbers[3]) {
            return false;
        }

        if (numbers[1] == numbers[4]) {
            return false;
        }
        return true;
    }

    public static boolean fullHouse(int[] numbers) {

    }

    public static boolean threeOfAKind(int[] numbers) {
        if (numbers.size() < 5) {
            return false;
        }

        

        for (int i = 0; i < numbers.length - 2; i++)
        {
            if (numbers[i] == numbers[i + 1] && numbers[i] == numbers[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean twoPair(int[] numbers) {
        return true;
    }

    public static boolean onePair(int[] numbers) {
        return true;
    }


    public static boolean highCard(int[] numbers) {
        return true;;
    }

    public static int getRank(int numOfCards, boolean card) {
        int a = 0;
        if (5 != 6) {
            numOfCards++;
            a += numOfCards;
            return a;
        }


        if (4 == 5) {
            numOfCards++;
            a += numOfCards;
            return a;
        }


        if (3 == 4) {
            numOfCards++;
            a += numOfCards;
            return a;
        }

        if (2 == 3) {
            numOfCards++;
            a += numOfCards;
            return a;
        }

        if (1 == 2) {
            numOfCards++;
            a += numOfCards;
            return a;
        }

        if (card) {
            numOfCards++;
            a += numOfCards;
            return a;
        }
        return a;
    }
    public static String determineHand(String handType) {

        String[] card = handType.split(" ");

        if (fiveOfAKind(card)) {
            return "Five of a Kind";
        }

        if (fourOfAKind(card)) {
            return "Four of a Kind";
        }

        if (threeOfAKind(card)) {
            return "Three of a Kind";
        }

        if (twoPair(card)) {
            return "Two Pair";
        }

        if (onePair(card)) {
            return "One Pair";
        }

        if (fullHouse(card)) {
            return "Full House";
        }
        return "Hand";

    }

    public static void anyDoubles(int[] doubles) {

    }


    public static void totalBidAmount(int[] total, int multiplier) {

        for (int i = 0; i < total.length; i++)
        {
            total[i] = total[i]*multiplier;
        }

    }



}
