package Memento;

/**
 * @author Kübra VARICI
 */
public class App {
    public static void main(String[] args) {

        AngryBirds angryBirds = new AngryBirds();
        angryBirds.setLevel(1L);
        angryBirds.setBolumAdi("Classic");

        System.out.println(angryBirds.toString());

        AngryBirdsCareTaker careTaker = new AngryBirdsCareTaker();
        /*
            T anında ilgili AngryBirds nesnesini kopyalıyoruz ve
            CareTaker nesnesi içerisindeki Memento'ya bağlıyoruz.
        */
        AngryBirdsMemento memento = angryBirds.kaydet();
        careTaker.setMemento(memento);

        angryBirds.setLevel(2L);
        angryBirds.setBolumAdi("Rio");

        System.out.println(angryBirds.toString());
        /*
            T anında kopyaladığımız nesneye CareTaker üzerinden erişiyor
            ve ilgili Originator nesnemize load ediyoruz.
        */
        angryBirds.oncekiBolumuYukle(careTaker.getMemento());
        System.out.println(angryBirds.toString());

    }
}
