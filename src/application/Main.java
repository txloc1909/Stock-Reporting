package application;

import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Interactive ex = new Interactive();
                ex.setVisible(true);
            }
        });
    }

}
