public class Poker {



    public static void main(String[] args)
    {
        String[] poker = new String[]{"Number of five of a kind hands: " + fiveOfAKind() + "\n",
                "Number of full house hands: " + fullHouse() + "\n",
                "Number of four of a kind hands: " + fourOfAKind() + "\n",
                "Number of three of a kind hands: " + threeOfAKind() + "\n",
                "Number of two pair hands: " + twoPair() + "\n",
                "Number of one pair hands: " + onePair() + "\n",
                "Number of high card hands: " + highCard() + "\n",
                "Total Bid Value: " + "\n",
                "Total Bid Value With Jacks Wild: " + "\n"};


        System.out.println(Arrays.toString(poker));
    }



    public static int fiveOfAKind() {

        return 1;
    }

    public static int fourOfAKind() {
        return 1;
    }

    public static int fullHouse() {
        return 1;
    }

    public static int threeOfAKind() {
        return 1;
    }

    public static int twoPair() {
        return 1;
    }

    public static int onePair() {
        return 1;
    }


    public static int highCard() {
        return 1;
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
    public static void getHand() {


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

