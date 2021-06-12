package limit;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class LimitInstanceClass {
    static int value = 0;
    static int temp=0;
    static {
        Properties props = new Properties();
        try {
            InputStream in = new BufferedInputStream(new FileInputStream("C:\\Users\\zml\\Desktop\\test\\src\\limit\\InstanceLimit.cfg"));
            props.load(in);
            value = Integer.parseInt(props.getProperty("limit"));

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    private static final List<LimitInstanceClass> list = new ArrayList<>(value);

    static {
        for (int i = 0; i < value; i++) {
            list.add(new LimitInstanceClass());
        }
    }

    int id;
    boolean isBusy;
    String accessMessage;

    public LimitInstanceClass() {
        id=temp;
        temp++;
        isBusy = false;
    }

    public void writeAccessMessage(String message) {
        this.accessMessage = message;
    }

    public void printAccessMessage() {
        System.out.println(this.accessMessage);
    }

    public void release() {
        this.isBusy = false;
    }

    public static LimitInstanceClass getInstance() {
        for (LimitInstanceClass i : list) {
            synchronized(i){
                if (!i.isBusy) {
                    i.isBusy = true;
                    return i;
                }
            }
        }
        return null;
    }
}
