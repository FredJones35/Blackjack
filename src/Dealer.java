import java.util.ArrayList;


public class Dealer implements GamblerActions {

    ArrayList<String> cards;
    boolean turn = false;

    public Dealer() {
        this.cards = new ArrayList<>();
    }
    public void set_turn(){
        this.turn = true;
    }

    @Override
    public void hit(ArrayList<String> deck) {
        cards.add(deck.getFirst());
    }

    @Override
    public void stand() {
        turn = false;
    }

    public void deal_cards(ArrayList<String> deck, Player player) {
        for (int i = 0; i < 2; i++) {
            cards.add(deck.getFirst());
            deck.removeFirst();
        }
        for (int i = 0; i < 2; i++) {
            player.cards.add(deck.getFirst());
            deck.removeFirst();
        }
    }

    @Override
    public int calculate_hand_value() {
        return ValueCalculator.calculate(cards);
    }

    public void play(ArrayList<String> deck){
        int value = calculate_hand_value();
        if (value<17){
            while(value<17){
                hit(deck);
                value = calculate_hand_value();
            }
        } else if (value>17) {
            stand();
        }
    }
}
