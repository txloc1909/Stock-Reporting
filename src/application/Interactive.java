package application;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import sentence.Sentence;
import storage.FileLoader;



public class Interactive extends JFrame {

    public Interactive() {

        initUI();
    }

    private void initUI() {

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));


        //Tạo top nằm ở phía trên trong panel
        JPanel top = new JPanel();
        top.setLayout(new BoxLayout(top, BoxLayout.X_AXIS));

        //Tạo nút trong top
        JButton btn = new JButton("Bán");
        JButton btn1 = new JButton("Mua");

        top.add(btn);
        top.add(Box.createRigidArea(new Dimension(10, 0)));// căn khoảng cách
        top.add(btn1);


        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(top);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));

        JTextArea tex = new JTextArea("Text Area",30,100);
        tex.setFont(new Font("Courier", Font.PLAIN, 20));
        panel.add(tex);

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FileLoader fl = new FileLoader("C:/Users/ABC/IdeaProjects/OOP/src/storage/ban.txt");
                try {
                    for (int i = 0; i < 10; i++) {
                        String template = fl.readRandomLine();

                        Sentence s = new Sentence(template);
                        tex.append('\n'+s.build());
                    }
                } catch (IOException ec) {
                    ec.printStackTrace();
                }
            }

        });

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                FileLoader fl = new FileLoader("C:/Users/ABC/IdeaProjects/OOP/src/storage/mua.txt");
                try {
                    for (int i = 0; i < 10; i++) {
                        String template = fl.readRandomLine();

                        Sentence s = new Sentence(template);
                        tex.append('\n'+s.build());
                    }
                } catch (IOException ec) {
                    ec.printStackTrace();
                }
            }
        });


        add(panel);
        pack();


        setTitle("Tin tức");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


}
