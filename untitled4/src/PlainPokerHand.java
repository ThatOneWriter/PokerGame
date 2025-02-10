import java.util.Arrays;
import java.util.ArrayList;

public class PlainPokerHand {

    private String cards;
    
    public String getHandType(Main other) {
   
      String one = other.getHandType();
      String two = other.getHandType();
      int typeComparison = thisType.compareTo(otherType);

      if (typeComparison != 0) {
         return -typeComparison; 
      }
      return this.cards.compareTo(other.cards);
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
