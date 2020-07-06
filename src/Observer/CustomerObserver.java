package Observer;

/**
 * @author Kübra VARICI
 * Gerçek takip eden nesne.
 */
public class CustomerObserver extends Observer{

    private String adi;
    private String soyadi;

    @Override
    public void update() {
        System.out.println(adi + " " + soyadi + ": Stok güncellendi, hemen almalıyım :)");
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
}
