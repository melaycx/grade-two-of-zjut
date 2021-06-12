package model;

public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new Observer(subject, "观察者1");
        Observer observer2 = new Observer(subject, "观察者2");
        Observer observer3 = new Observer(subject, "观察者3");
        Report report1 = new Report1();
        Report report2 = new Report2();
        Report report3 = new Report3();
        subject.setReport(report1);
        subject.notifyAllObserver();
        subject.setReport(report2);
        subject.notifyAllObserver();
        subject.setReport(report3);
        subject.notifyAllObserver();
    }
}
