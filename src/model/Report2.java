package model;

import java.util.Random;

public class Report2 implements Report{

    @Override
    public String report() {
        Random random=new Random();
        double price1=random.nextDouble()*100;
        double price2=random.nextDouble()*100;
        double price3=random.nextDouble()*100;
        String message="最高价格为"+price1+"最低价格为"+price2+"均价为"+price3;
        return message;
    }
}
