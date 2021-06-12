package model;

import java.util.Random;

public class Report3 implements Report{
    @Override
    public String report() {
        Random random=new Random();
        double []price=new double[10];
        for(int i=0;i<10;i++){
            price[i]=random.nextDouble()*100;
        }
        String message="预测价格趋势：";
        for(double i:price){
            message=message+i+"  ";
        }
        return message;
    }
}
