package storage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class FileLoader {
    private String fileName;
    private int fileSize;
    private final String PATH_PREFIX = System.getProperty("user.dir") + "\\src\\storage\\";

    public FileLoader(String filename) {
        this.fileName = PATH_PREFIX + filename;
        try {
            this.fileSize = getSizeofFile(this.fileName);
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
        int random_index = rand.nextInt(fileSize);

        for (int i = 0; i < random_index; i++) {
            buf.readLine();
        }
        output = buf.readLine();
        buf.close();
        return output;
    }

//    public static void main(String[] args) {
//        FileLoader fl = new FileLoader("tang.txt");
//        try {
//            for (int i = 0; i < 10; i++) {
//                String template = fl.readRandomLine();
//                //template = "Sau đợt phát hành, tổng số cổ phiếu của |StockCode| tăng từ |PreviousAmount| cổ phần lên |LaterAmount| cổ phần.";
//                Sentence s = new Sentence(template);
//                System.out.println(s.build());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
