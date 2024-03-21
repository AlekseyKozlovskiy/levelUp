package skillFactory.OneZeroStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
/*

Make byte InputStream OneZeroStream, which gives
1 0 1 0 .....

*/

        Scanner scanner = new Scanner(new OneZeroStream());
        BufferedReader reader = new BufferedReader(new InputStreamReader(new OneZeroStream()));
        for (int i = 0; i < 10; i++){
            System.out.print(reader.read());
        }

/*

The code above has to output

1010101010

*/
    }

}
