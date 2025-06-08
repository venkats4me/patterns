package ObserverDesignPattern;

public class ObserverDemo {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Observer channel1 = new NewsChannel("Channel1");
        Observer channel2 = new NewsChannel("Channel2");

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.breakingNews("New Observer Pattern Released!");
    }
}
