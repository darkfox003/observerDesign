package observerDesign;

import java.util.ArrayList;

public class Reporter implements Source{

    private ArrayList<Observer> observerList;
    private String score;

    public Reporter() {
        observerList = new ArrayList<>();
    }

    public void setScore(String str) {
        score = str;
        notifyObserver();
    }

    public String getScore() {
        return score;
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observerList) {
            o.update(this);
        }
    }

    @Override
    public void register(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observerList.remove(o);
    }
    
}
