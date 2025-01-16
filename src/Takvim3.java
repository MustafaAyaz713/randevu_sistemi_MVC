import java.util.ArrayList;
import java.util.List;

public class Takvim3 extends Takvim {
    public Takvim3() {
        this.randevuListesi = new ArrayList<>();

        randevuListesi.add(new Randevu(10, 11, 2023, 12));
        randevuListesi.add(new Randevu(5, 12, 2023, 10));
        randevuListesi.add(new Randevu(23, 7, 2023, 19));
        randevuListesi.add(new Randevu(21, 12, 2023, 13));
    }

    public List<Randevu> getRandevuListesi() {
        return randevuListesi;
    }
}