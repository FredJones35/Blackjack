import java.util.ArrayList;

public class ValueCalculator {
    public static Integer calculate(ArrayList<String> cards) {
        int sum = 0;
        for (String card : cards) {
            char card_val = card.charAt(0);
            if (card_val == 'J' || card_val == 'K' || card_val == 'Q') {
                sum += 10;
            } else if (card_val != 'A') {
                sum += Character.getNumericValue(card_val);
            }else {
                if (sum <= 10){
                    sum += 11;
                }else {
                    sum += 1;
                }
            }
        }
        return sum;
    }

}
