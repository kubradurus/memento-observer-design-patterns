package Memento;

/**
 * @author Kübra VARICI
 * Orginator : Durumu saklanacak ve geri alınacak yapı.
 */
public class AngryBirds {

    public Long level;
    public String bolumAdi;

    public AngryBirdsMemento kaydet()
    {
        return new AngryBirdsMemento(level, bolumAdi);
    }

    //T anındaki nesneye bizi ulaştıracak olan metod.
    public void oncekiBolumuYukle(AngryBirdsMemento memento)
    {
        this.level = memento.getLevel();
        this.bolumAdi = memento.getBolumAdi();
    }

    @Override
    public String toString() {
        return " Level = " + level + ", Bölüm Adı = " + bolumAdi;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public String getBolumAdi() {
        return bolumAdi;
    }

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }
}
