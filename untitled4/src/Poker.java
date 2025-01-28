import java.io.File;
import java.util.Arrays;


public class Poker {

    public static void main(String[] args) {

        String[] poker = {"3","2","10","3", "King"};

        File f = new File("src/input");

        String fileData = "";

    }

    public static void ifJack() {

    }

    public static void getRank(String[] rank) {

    }

    public static void getHand(String[] hand) {

    }

    public static void anyDoubles(int[] doubles) {

    }


    public static void totalBidAmount(int[] total, int multiplier) {

        for (int i = 0; i < total.length; i++)
        {
            total[i] = total[i]*multiplier;
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

