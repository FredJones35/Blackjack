import java.util.ArrayList;

public interface GamblerActions {

    int calculate_hand_value();


    void hit(ArrayList<String> deck);

    void stand();


}
