package skillFactory.OneZeroStream;

import java.io.InputStream;

public class OneZeroStream extends InputStream {
    private byte[] bytes = {'1', '0', ' '};
    int i = 0;
    boolean check = true;


    public int read(){
        if (check) {
            check = !check;
            return 1;
        } else {
            check = !check;
            return 0;
        }

    }
}
