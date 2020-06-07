package storage;

import sentence.Sentence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FileLoader {
    private String fileName;

    public FileLoader(String filename) {
        this.fileName = filename;
    }

    public String readRandomLine() throws IOException {
        String output;
        FileReader reader = new FileReader(fileName);
        BufferedReader buf = new BufferedReader(reader);
        Random rand = new Random();
        int a = rand.nextInt(18);

        for (int i = 0; i < a; i++) {
            buf.readLine();
        }
        output = buf.readLine();
        buf.close();
        return output;
    }

    public static void main(String[] args) {
        FileLoader fl = new FileLoader("C:\\Users\\ABC\\IdeaProjects\\OOP\\src\\storage\\mau_cau.txt");
        try {
            for (int i = 0; i < 10; i++) {
                String template = fl.readRandomLine();
                //template = "Sau đợt phát hành, tổng số cổ phiếu của |StockCode| tăng từ |PreviousAmount| cổ phần lên |LaterAmount| cổ phần.";
                Sentence s = new Sentence(template);
                System.out.println(s.build());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
