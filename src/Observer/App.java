package Observer;

/**
 * @author Kübra VARICI
 */
public class App {
    public static void main(String[] args) {
        Product product = new Product();

        CustomerObserver customerObserver = new CustomerObserver();
        customerObserver.setAdi("Ahmet");
        customerObserver.setSoyadi("Mutlu");

        product.attach(customerObserver);

        CustomerObserver2 customerObserver2 = new CustomerObserver2();
        customerObserver2.setAdi("Mehmet");
        customerObserver2.setSoyadi("Keskin");

        product.attach(customerObserver2);

        product.updateStock();

        product.detach(customerObserver);
        product.detach(customerObserver2);
    }
}
