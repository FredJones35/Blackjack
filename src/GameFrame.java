import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
public class GameFrame extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(GameFrame.class.getName());
    private GameEngine gameEngine = new GameEngine();
    private int playerBet = 0;
    private int player_card_index = 2;
    private int dealer_card_index = 2;
    private ArrayList<JLabel> p_card_labels = new ArrayList<>();
    private ArrayList<JLabel> d_card_labels = new ArrayList<>();
    private Result gameResult = Result.NOT_RESULTED;
   
    public GameFrame() {
        initComponents();
        addLabels();
    }
    public int getPlayerBet(){
        return playerBet;
    }
    private void addLabels(){
        p_card_labels.add(p_card_placement_label1);
        p_card_labels.add(p_card_placement_label2);
        p_card_labels.add(p_card_placement_label3);
        p_card_labels.add(p_card_placement_label4);
        
        d_card_labels.add(d_card_placement_label1);
        d_card_labels.add(d_card_placement_label2);
        d_card_labels.add(d_card_placement_label3);
        d_card_labels.add(d_card_placement_label4);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        game_panel = new javax.swing.JPanel();
        dealers_cards_panel = new javax.swing.JPanel();
        d_card_placement_label1 = new javax.swing.JLabel();
        d_card_placement_label2 = new javax.swing.JLabel();
        d_card_placement_label3 = new javax.swing.JLabel();
        d_card_placement_label4 = new javax.swing.JLabel();
        deck_label = new javax.swing.JLabel();
        players_cards_panel = new javax.swing.JPanel();
        p_card_placement_label1 = new javax.swing.JLabel();
        p_card_placement_label2 = new javax.swing.JLabel();
        p_card_placement_label3 = new javax.swing.JLabel();
        p_card_placement_label4 = new javax.swing.JLabel();
        bet_panel = new javax.swing.JPanel();
        increase_button = new javax.swing.JButton();
        decrease_button = new javax.swing.JButton();
        bet_label = new javax.swing.JLabel();
        bet_button = new javax.swing.JButton();
        dollar_label = new javax.swing.JLabel();
        player_points_label = new javax.swing.JLabel();
        dealer_points_label = new javax.swing.JLabel();
        buttons_panel = new javax.swing.JPanel();
        hit_button = new javax.swing.JButton();
        stand_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Blackjack");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("GameFrame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1010, 650));
        setSize(new java.awt.Dimension(1000, 670));

        game_panel.setBackground(new java.awt.Color(204, 255, 204));
        game_panel.setPreferredSize(new java.awt.Dimension(1000, 600));

        dealers_cards_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dealers_cards_panel.setName("dealers_cards_panel"); // NOI18N

        d_card_placement_label1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        d_card_placement_label1.setPreferredSize(new java.awt.Dimension(127, 184));
        dealers_cards_panel.add(d_card_placement_label1);

        d_card_placement_label2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        d_card_placement_label2.setPreferredSize(new java.awt.Dimension(127, 184));
        dealers_cards_panel.add(d_card_placement_label2);

        d_card_placement_label3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        d_card_placement_label3.setPreferredSize(new java.awt.Dimension(127, 184));
        dealers_cards_panel.add(d_card_placement_label3);

        d_card_placement_label4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 0)));
        d_card_placement_label4.setPreferredSize(new java.awt.Dimension(127, 184));
        dealers_cards_panel.add(d_card_placement_label4);

        deck_label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cards/BACK.png"))); // NOI18N
        deck_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deck_label.setName("deck_label"); // NOI18N

        players_cards_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        players_cards_panel.setName("players_cards_panel"); // NOI18N

        p_card_placement_label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_card_placement_label1.setPreferredSize(new java.awt.Dimension(127, 184));
        players_cards_panel.add(p_card_placement_label1);

        p_card_placement_label2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_card_placement_label2.setPreferredSize(new java.awt.Dimension(127, 184));
        players_cards_panel.add(p_card_placement_label2);

        p_card_placement_label3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_card_placement_label3.setPreferredSize(new java.awt.Dimension(127, 184));
        players_cards_panel.add(p_card_placement_label3);

        p_card_placement_label4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        p_card_placement_label4.setPreferredSize(new java.awt.Dimension(127, 184));
        players_cards_panel.add(p_card_placement_label4);

        increase_button.setText("+");
        increase_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increase_buttonActionPerformed(evt);
            }
        });

        decrease_button.setText("-");
        decrease_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decrease_buttonActionPerformed(evt);
            }
        });

        bet_label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bet_label.setText("0");

        bet_button.setText("Bet");
        bet_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bet_buttonActionPerformed(evt);
            }
        });

        dollar_label.setText("$");

        javax.swing.GroupLayout bet_panelLayout = new javax.swing.GroupLayout(bet_panel);
        bet_panel.setLayout(bet_panelLayout);
        bet_panelLayout.setHorizontalGroup(
            bet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bet_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(increase_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(decrease_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bet_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bet_panelLayout.createSequentialGroup()
                        .addComponent(bet_label, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dollar_label)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        bet_panelLayout.setVerticalGroup(
            bet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bet_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(increase_button)
                .addGap(18, 18, 18)
                .addGroup(bet_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bet_label)
                    .addComponent(dollar_label))
                .addGap(18, 18, 18)
                .addComponent(decrease_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bet_button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        player_points_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        player_points_label.setText("You : 0");
        player_points_label.setName("player_points_label"); // NOI18N

        dealer_points_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dealer_points_label.setText("Dealer : 0");
        dealer_points_label.setName("dealer_points_label"); // NOI18N

        buttons_panel.setName("buttons_panel"); // NOI18N
        buttons_panel.setVisible(false);

        hit_button.setText("Hit");
        hit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hit_buttonActionPerformed(evt);
            }
        });

        stand_button.setText("Stand");
        stand_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stand_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttons_panelLayout = new javax.swing.GroupLayout(buttons_panel);
        buttons_panel.setLayout(buttons_panelLayout);
        buttons_panelLayout.setHorizontalGroup(
            buttons_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttons_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttons_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hit_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stand_button, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttons_panelLayout.setVerticalGroup(
            buttons_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttons_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hit_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stand_button)
                .addContainerGap())
        );

        javax.swing.GroupLayout game_panelLayout = new javax.swing.GroupLayout(game_panel);
        game_panel.setLayout(game_panelLayout);
        game_panelLayout.setHorizontalGroup(
            game_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(game_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(game_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(game_panelLayout.createSequentialGroup()
                        .addComponent(deck_label)
                        .addGap(43, 43, 43)
                        .addComponent(dealers_cards_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE)
                        .addGap(81, 81, 81))
                    .addGroup(game_panelLayout.createSequentialGroup()
                        .addComponent(bet_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(players_cards_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttons_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, game_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dealer_points_label, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(432, 432, 432))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, game_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(player_points_label, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(417, 417, 417))
        );
        game_panelLayout.setVerticalGroup(
            game_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(game_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(dealer_points_label)
                .addGap(18, 18, 18)
                .addGroup(game_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deck_label)
                    .addComponent(dealers_cards_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addGroup(game_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, game_panelLayout.createSequentialGroup()
                        .addGroup(game_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(buttons_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bet_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, game_panelLayout.createSequentialGroup()
                        .addComponent(players_cards_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(player_points_label)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(game_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(game_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(606, 606, 606))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void end_game(){
        int answer = -1;
        switch(gameResult){
            case WIN:
                answer = JOptionPane.showConfirmDialog(null, "You won. Game over. Play again?","Game message",JOptionPane.YES_NO_OPTION);
                break;
            case LOSE:
                answer = JOptionPane.showConfirmDialog(null, "You lost. Game over. Play again?","Game message",JOptionPane.YES_NO_OPTION);
                break;
            case PUSH:
                answer = JOptionPane.showConfirmDialog(null, "Tie. Game over. Play again?","Game message",JOptionPane.YES_NO_OPTION);
                break;
        }
        if(answer == 1){
            this.dispose();
            System.exit(0);
        }else{
            GameFrame gameframe2 = new GameFrame();
            gameframe2.setVisible(true);
            this.dispose();
        }
    }
    
    private void hit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hit_buttonActionPerformed
        // TODO add your handling code here:
        Player player = gameEngine.getPlayer();
        ArrayList<String> deck = gameEngine.getDeck();
        player.hit(deck);
        deck.removeFirst();
        p_card_labels.get(player_card_index).setIcon(CardIcons.getIcon(player.cards.getLast()));
        player_points_label.setText("You :"+ValueCalculator.calculate(player.cards).toString());
        if(ValueCalculator.calculate(player.cards)>21){
            gameResult = Result.LOSE;
            end_game();
            return;
        }
        player_card_index++;
    }//GEN-LAST:event_hit_buttonActionPerformed

    private void increase_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increase_buttonActionPerformed
            // TODO add your handling code here:
            Integer num = parseInt(bet_label.getText());
            num += 10;
            bet_label.setText(num.toString());
    }//GEN-LAST:event_increase_buttonActionPerformed

    private void decrease_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decrease_buttonActionPerformed
        // TODO add your handling code here:
        Integer num = parseInt(bet_label.getText());
        if(num != 0){
            num -= 10;
            bet_label.setText(num.toString());
        }
    }//GEN-LAST:event_decrease_buttonActionPerformed

    private void bet_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bet_buttonActionPerformed
        // TODO add your handling code here:
        Dealer dealer = gameEngine.getDealer();
        Player player = gameEngine.getPlayer();
        playerBet = parseInt(bet_label.getText());
        bet_label.setText("0");
        bet_panel.setVisible(false);
        player.bet();
        dealer.deal_cards(gameEngine.getDeck(), gameEngine.getPlayer());
        d_card_placement_label1.setIcon(CardIcons.getIcon(dealer.cards.getFirst()));
        d_card_placement_label2.setIcon(CardIcons.getIcon(dealer.cards.get(1)));
        p_card_placement_label1.setIcon(CardIcons.getIcon(player.cards.getFirst()));
        p_card_placement_label2.setIcon(CardIcons.getIcon(player.cards.get(1)));
        dealer_points_label.setText("Dealer :"+ValueCalculator.calculate(dealer.cards).toString());
        player_points_label.setText("You :"+ValueCalculator.calculate(player.cards).toString());
        buttons_panel.setVisible(true);
        player.set_turn();
    }//GEN-LAST:event_bet_buttonActionPerformed

    private void stand_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stand_buttonActionPerformed
        // TODO add your handling code here:
        Timer timer = new Timer(3000,null);
        buttons_panel.setVisible(false);
        Dealer dealer = gameEngine.getDealer();
        Player player = gameEngine.getPlayer();
        ArrayList<String> deck = gameEngine.getDeck();
        timer.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(ValueCalculator.calculate(dealer.cards) >= 17){
                    ((Timer) e.getSource()).stop();
                    if(dealer.calculate_hand_value() > 21){
                        gameResult = Result.WIN;
                    }else{
                        if(dealer.calculate_hand_value() > player.calculate_hand_value()){
                            gameResult = Result.LOSE;
                            end_game();
                        }else if(dealer.calculate_hand_value() < player.calculate_hand_value()){
                            gameResult = Result.WIN;
                            end_game();
                        }else{
                            gameResult = Result.PUSH;
                            end_game();
                        }
                    }
                    return;
                }
                dealer.hit(deck);
                deck.removeFirst();
                d_card_labels.get(dealer_card_index).setIcon(CardIcons.getIcon(dealer.cards.getLast()));
                dealer_points_label.setText("Dealer :"+ValueCalculator.calculate(dealer.cards).toString());
                dealer_card_index++;
            }
        });
         timer.setInitialDelay(0);
         timer.start();
    }//GEN-LAST:event_stand_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new GameFrame().setVisible(true));
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bet_button;
    private javax.swing.JLabel bet_label;
    private javax.swing.JPanel bet_panel;
    private javax.swing.JPanel buttons_panel;
    private javax.swing.JLabel d_card_placement_label1;
    private javax.swing.JLabel d_card_placement_label2;
    private javax.swing.JLabel d_card_placement_label3;
    private javax.swing.JLabel d_card_placement_label4;
    private javax.swing.JLabel dealer_points_label;
    private javax.swing.JPanel dealers_cards_panel;
    private javax.swing.JLabel deck_label;
    private javax.swing.JButton decrease_button;
    private javax.swing.JLabel dollar_label;
    private javax.swing.JPanel game_panel;
    private javax.swing.JButton hit_button;
    private javax.swing.JButton increase_button;
    private javax.swing.JLabel p_card_placement_label1;
    private javax.swing.JLabel p_card_placement_label2;
    private javax.swing.JLabel p_card_placement_label3;
    private javax.swing.JLabel p_card_placement_label4;
    private javax.swing.JLabel player_points_label;
    private javax.swing.JPanel players_cards_panel;
    private javax.swing.JButton stand_button;
    // End of variables declaration//GEN-END:variables
    
}
