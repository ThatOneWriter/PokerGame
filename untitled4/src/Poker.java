import java.util.Arrays;


public class Poker {

    private static String handType;


    public static void main(String[] args)
    {
        String[] poker = new String[]{"Number of five of a kind hands: " + fiveOfAKind() + "\n",
                "Number of full house hands: " + fullHouse() + "\n",
                "Number of four of a kind hands: " + fourOfAKind() + "\n",
                "Number of three of a kind hands: " + threeOfAKind() + "\n",
                "Number of two pair hands: " + twoPair() + "\n",
                "Number of one pair hands: " + onePair() + "\n",
                "Number of high card hands: " + highCard() + "\n",
                "Total Bid Value: " + totalBidAmount() + "\n",
                "Total Bid Value With Jacks Wild: " + anyJacks() + "\n"};


        System.out.println(Arrays.toString(poker));
    }



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

        Arrays.sort(numbers);

        if (numbers[0] == numbers[3]) {
            return false;
        }

        if (numbers[1] == numbers[4]) {
            return false;
        }
        return true;
    }

    public static boolean fullHouse(int[] numbers) {
        if (numbers.size() < 5) {
            return false;
        }

        Arrays.sort(numbers);

        if (numbers[0] == numbers[3]) {
            return false;
        }

        if (numbers[1] == numbers[4]) {
            return false;
        }

    }

    public static boolean threeOfAKind(int[] numbers) {
        if (numbers.size() < 5) {
            return false;
        }

        Arrays.sort[numbers];

        for (int i = 0; i < numbers.length - 2; i++)
        {
            if (numbers[i] == numbers[i + 1] && numbers[i] == numbers[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static boolean twoPair(int[] numbers) {
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

    public static boolean onePair(int[] numbers) {
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


    public static boolean highCard(int[] numbers) {
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
