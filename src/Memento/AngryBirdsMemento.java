package Memento;

/**
 * @author Kübra VARICI
 * Orginator nesnesinin anlık görüntülerini tutan yapı.
 */
public class AngryBirdsMemento {
    public Long level;
    public String bolumAdi;

    public AngryBirdsMemento(Long level, String bolumAdi) {
        this.level = level;
        this.bolumAdi = bolumAdi;
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
