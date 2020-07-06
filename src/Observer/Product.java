package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kübra VARICI
 * Subject - Takip edilecek olan nesne.
 */
public class Product {

    private List<Observer> observers = new ArrayList<Observer>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    private void sendNotify() {
        // Herhangi bir değişiklik olduğunda gözlemleyicilerin update metotunu tetiklenerek
        // istenilen aksiyon gerçekleştirilir. Örneğin: Kullanıcılara e-posta atmak gibi.
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void updateStock() {
        // Stok değiştirildiğinde gözlemcilere bildirilir.
        sendNotify();
    }
}
