import java.util.ArrayList;
import java.util.List;

public class Takvim2 extends Takvim {
    public Takvim2() {
        this.randevuListesi = new ArrayList<>();

        randevuListesi.add(new Randevu(8, 12, 2023, 14));
        randevuListesi.add(new Randevu(5, 12, 2023, 10));
        randevuListesi.add(new Randevu(15, 6, 2023, 19));
        randevuListesi.add(new Randevu(16, 6, 2023, 14));
    }

    public List<Randevu> getRandevuListesi() {
        return randevuListesi;
    }

}