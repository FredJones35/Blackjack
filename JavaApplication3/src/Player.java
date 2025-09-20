import java.util.ArrayList;

public class Player implements GamblerActions {
    String username;
    int money;
    ArrayList<String> cards;
    int bet;
    boolean turn = false;

    public Player() {
        this.username = "User";
        this.money = 100;
        cards = new ArrayList<>();
    }

    public int bet() {
        money -= bet;
        return bet;
    }

    public void hit(ArrayList<String> deck) {
        cards.add(deck.getFirst());
    }
    public void set_turn(){
        this.turn = true;
    }
    public void stand() {
        turn = false;
    }

    @Override
    public int calculate_hand_value() {
        return ValueCalculator.calculate(cards);
    }

    public void play(ArrayList<String> deck) {

    }
}
