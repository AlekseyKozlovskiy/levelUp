package skillFactory.readFile;

import java.io.*;

public class CountingNumbers {
    public static void main(String[] args) throws IOException {
        String file = "src\\skillFactory\\file.txt";
        File f = new File(file);
        System.out.println(f.exists());
        FileInputStream fileInputStream = new FileInputStream(file);
        int i;
        int count = 0;

        while ((i = fileInputStream.read()) != -1 ){
            if (i > 47 || i < 58) {
                count++;
            }
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
