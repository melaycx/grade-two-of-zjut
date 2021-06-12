package model;

public class Observer {
    Subject subject;
    String name;
    public Observer(Subject subject,String name) {
        this.subject = subject;
        this.subject.add(this);
        this.name=name;
    }


    public void update() {
       System.out.println(name+"收到报告:"+subject.report.report());
    }
}
