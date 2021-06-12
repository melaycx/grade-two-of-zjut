package limit;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class UseLimitInstanceClass {
    public static void main(String[] args) {

        List<AccessLimitInstanceClassThread> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = "第" + i + "个线程";
            list.add(new AccessLimitInstanceClassThread(name));
        }
        for(AccessLimitInstanceClassThread i:list)
            i.start();
    }
}
