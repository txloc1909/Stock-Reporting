package application;

import sentence.Sentence;
import storage.FileLoader;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class Mnemonics extends JFrame {

    public Mnemonics() {

        initUI();
    }

    private void initUI() {

        JButton btn = new JButton("Bán");
        JButton btn1 = new JButton("Mua");

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Cụ thể, chỉ trong ngày |Date|/ |Month|, |StockCode| đã bán xong |StockAmount| cổ phiếu |StockCode|." );
            }

        });
        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FileLoader fl = new FileLoader("C:\\Users\\ABC\\IdeaProjects\\OOP\\src\\storage\\mau_cau.txt");
                try {
                    for (int i = 0; i < 10; i++) {
                        String template = fl.readRandomLine();
                        Sentence s = new Sentence(template);
                        System.out.println(s.build());
                    }
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
            }

        });



        createLayout(btn,btn1);



        setTitle("Tin tức");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addGap(10)
                .addComponent(arg[1])
                .addGap(200)
        );

        gl.setVerticalGroup(gl.createParallelGroup()
                .addComponent(arg[0])
                .addComponent(arg[1])
                .addGap(200)
        );


        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Mnemonics example = new Mnemonics();
                example.setVisible(true);
            }
        });
    }

}
