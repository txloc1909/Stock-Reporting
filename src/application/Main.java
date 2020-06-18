package application;

import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Interactive user_panel = new Interactive();
                user_panel.setVisible(true);
            }
        });
    }

}
