package model;

import java.util.Random;

public class Report1 implements Report{

    @Override
    public String report() {
        Random random=new Random();
        double price=random.nextDouble()*100;
        String message="当前价格为"+price;
        return message;
    }
}
