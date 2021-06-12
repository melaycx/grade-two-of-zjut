package limit;

import java.util.Random;

public class AccessLimitInstanceClassThread extends Thread {
    String name;
    public AccessLimitInstanceClassThread(String name){
        this.name=name;
    }
    @Override
    public void run() {
        LimitInstanceClass limitInstanceClass = LimitInstanceClass.getInstance();
        while (limitInstanceClass==null){
            limitInstanceClass=LimitInstanceClass.getInstance();
        }
        limitInstanceClass.writeAccessMessage(name);
        Random random=new Random();
        int time=random.nextInt(5000);
        try {
            sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        limitInstanceClass.printAccessMessage();
        limitInstanceClass.release();
    }
}
