package storage;

import sentence.Sentence;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FileLoader {
    private String fileName;
    private int fileSize;

    public FileLoader(String filename) {
        this.fileName = filename;
        try {
            this.fileSize = getSizeofFile(filename);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private int getSizeofFile(String fileName) throws IOException {
        FileReader reader = new FileReader(fileName);
        BufferedReader buf = new BufferedReader(reader);
        int size = 0;

        while (buf.readLine() != null)
            size++;

        buf.close();
        return size;
    }

    public String readRandomLine() throws IOException {
        String output;
        FileReader reader = new FileReader(fileName);
        BufferedReader buf = new BufferedReader(reader);
        Random rand = new Random();
        int a = rand.nextInt(fileSize);

        for (int i = 0; i < a; i++) {
            buf.readLine();
        }
        output = buf.readLine();
        buf.close();
        return output;
    }

    public static void main(String[] args) {
        FileLoader fl = new FileLoader("C:\\Users\\ABC\\IdeaProjects\\OOP\\src\\storage\\tang.txt");
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
