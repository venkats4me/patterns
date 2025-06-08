package ObserverDesignPattern;
import java.util.*;
public class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void breakingNews(String news) {
        System.out.println("News: " + news);
        notifyObservers(news);
    }
}
