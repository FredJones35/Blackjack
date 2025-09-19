import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    Player player;
    Dealer dealer;
    ArrayList<String> deck = new ArrayList<>(Arrays.asList(
            "2-C", "3-C", "4-C", "5-C", "6-C", "7-C", "8-C", "9-C", "10-C", "J-C", "Q-C", "K-C", "A-C",
            "2-D", "3-D", "4-D", "5-D", "6-D", "7-D", "8-D", "9-D", "10-D", "J-D", "Q-D", "K-D", "A-D",
            "2-H", "3-H", "4-H", "5-H", "6-H", "7-H", "8-H", "9-H", "10-H", "J-H", "Q-H", "K-H", "A-H",
            "2-S", "3-S", "4-S", "5-S", "6-S", "7-S", "8-S", "9-S", "10-S", "J-S", "Q-S", "K-S", "A-S"
    ));
    Game(){
        player = new Player();
        dealer = new Dealer();
    }
    void player_push(){
        player.money += player.bet;
        player.bet = 0;
    }
    void player_win(){
        player.money += 2*player.bet;
        player.bet = 0;
    }
    void dealer_win(){
        player.bet = 0;
    }
    void check_player_hand(){
        if(player.calculate_hand_value() > 21){
            dealer_win();
        }
    }
    void check_dealer_hand(){
        if(dealer.calculate_hand_value() > 21){
            player_win();
        }
    }
    void compare_hands(){
        if(player.calculate_hand_value()>dealer.calculate_hand_value()){
            player_win();
        } else if (player.calculate_hand_value()<dealer.calculate_hand_value()) {
            dealer_win();
        }else {
            player_push();
        }
    }
    void game_loop(){
        while(true){
            player.bet();
            dealer.deal_cards(deck,player);
            player.set_turn();
            while(player.turn){
                player.play(deck);
            }
            check_player_hand();
            dealer.set_turn();
            while(dealer.turn){
                dealer.play(deck);
            }
            check_dealer_hand();
            compare_hands();
        }
    }
}
