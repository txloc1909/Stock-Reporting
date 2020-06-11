package application;

import java.awt.Dimension;
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
import javax.swing.JScrollPane;

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
        JButton btn1 = new JButton("Bán");
        JButton btn2 = new JButton("Mua");
        JButton btn3 = new JButton("Tăng");
        JButton btn4 = new JButton("Giảm");
        JButton btn5 = new JButton("Giao dịch");
        JButton btn6 = new JButton("Niêm Yết");

        top.add(btn1);
        top.add(Box.createRigidArea(new Dimension(10, 0)));// căn khoảng cách
        top.add(btn2);
        top.add(Box.createRigidArea(new Dimension(10, 0)));
        top.add(btn3);
        top.add(Box.createRigidArea(new Dimension(10, 0)));
        top.add(btn4);
        top.add(Box.createRigidArea(new Dimension(10, 0)));
        top.add(btn5);
        top.add(Box.createRigidArea(new Dimension(10, 0)));
        top.add(btn6);


        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(top);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));

        JTextArea tex = new JTextArea("Text Area",30,100);
        tex.setFont(new Font("Courier", Font.PLAIN, 20));


        //tạo scrollbar trong text
        JScrollPane sc = new JScrollPane(tex);
        panel.add(sc);

        btn1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FileLoader fl = new FileLoader("C:\\Users\\ABC\\IdeaProjects\\OOP\\src" +
                        "\\storage\\ban.txt");
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

        btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                FileLoader fl = new FileLoader("C:\\Users\\ABC\\IdeaProjects\\OOP\\src" +
                        "\\storage\\mua.txt");
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

        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FileLoader fl = new FileLoader("C:\\Users\\ABC\\IdeaProjects\\OOP\\src" +
                        "\\storage\\tang.txt");
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

        btn4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FileLoader fl = new FileLoader("C:\\Users\\ABC\\IdeaProjects\\OOP\\src" +
                        "\\storage\\giam.txt");
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

        btn5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FileLoader fl = new FileLoader("C:\\Users\\ABC\\IdeaProjects\\OOP\\src" +
                        "\\storage\\giao_dich.txt");
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

        btn6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FileLoader fl = new FileLoader("C:\\Users\\ABC\\IdeaProjects\\OOP\\src" +
                        "\\storage\\niem_yet.txt");
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