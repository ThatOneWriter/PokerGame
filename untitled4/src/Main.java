import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String[] fileData = getFileData("src/example_input");
        PlainPokerHand[] cards = buildHands(fileData, false);

        int five = 0;
        int four = 0;
        int three = 0;
        int twoPairs = 0;
        int two = 0;
        int fullHouse = 0;
        int highCard = 0;

        for (PlainPokerHand h : cards) {
            String type = h.getHandType();
            if (type.equals("A")) {
                five++;
            }
            else if (type.equals("B")) {
                four++;
            }
            else if (type.equals("C")) {
                fullHouse++;
            }
            else if (type.equals("D")) {
                three++;
            }
            else if (type.equals("E")) {
                twoPairs++;
            }
            else if (type.equals("F")) {
                two++;
            }
            else if (type.equals("G")) {
                highCard++;
            }
        }

        System.out.println("Number of five of a kind hands: " + five);
        System.out.println("Number of full house hands: " + fullHouse);
        System.out.println("Number of four of a kind hands: " + four);
        System.out.println("Number of three of a kind hands: " + three);
        System.out.println("Number of two pair hands: " + twoPairs);
        System.out.println("Number of one pair hands: " + two);
        System.out.println("Number of high card hands: " + highCard);



        int total = 0;
        for (int i = 0; i < cards.length; i++) {
            int rank = i + 1;
            total = total + (rank * cards[i].getBid());
        }
        System.out.println("Total Bid Value: " + total);

        cards = buildHands(fileData, true);

        total = 0;
        for (int i = 0; i < cards.length; i++) {
            int rank = i + 1;
            total = total + (rank * cards[i].getBid());
        }
        System.out.println("Total Bid Value With Jacks Wild: " + total);

    }

    public static PlainPokerHand[] buildHands(String[] fileData, boolean jacksWild) {
        PlainPokerHand[] hands = new PlainPokerHand[fileData.length];
        int index = 0;
        for (String line : fileData) {
            String[] splitLine = line.split("\\|");
            PlainPokerHand cc = new PlainPokerHand(splitLine[0], Integer.parseInt(splitLine[1]), jacksWild);
            hands[index] = cc;
            index++;
        }

        Arrays.sort(hands);

        return hands;
    }

    public static String[] getFileData(String fileName) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
            scanner.close();
    }
}
       
