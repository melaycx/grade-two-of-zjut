package model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> list = new ArrayList<>();
    public Report report;

    public void setReport(Report report) {
        this.report = report;
    }

    public void add(Observer observer) {
        this.list.add(observer);
    }

    public void delete(Observer observer) {
        this.list.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer observer : list) {
           observer.update();
        }
    }
}
