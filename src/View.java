import java.util.List;
import java.util.Scanner;

public class View {

    public int DoktorGoruntule(Model imodel) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hangi Doktora randevu almak istiyorsunuz?");
        System.out.println("1. Eyüp Terzi Psikolog");
        System.out.println("2. Mustafa Ayaz Göz Doktoru");
        System.out.println("3. Melik Demirel Aşk Doktoru");

        return scanner.nextInt();
    }

    public void randevulariGoruntule(Takvim1 takvim1, Takvim2 takvim2, Takvim3 takvim3) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Doktor seç numaraya göre:");
        System.out.println("1. Eyüp Terzi");
        System.out.println("2. Mustafa Ayaz");
        System.out.println("3. Melik Demirel");

        int doktorSecimi = scanner.nextInt();

        List<Randevu> randevuListesi;
        switch (doktorSecimi) {
            case 1:
                randevuListesi = takvim1.getRandevuListesi();
                break;
            case 2:
                randevuListesi = takvim2.getRandevuListesi();
                break;
            case 3:
                randevuListesi = takvim3.getRandevuListesi();
                break;
            default:
                System.out.println("Geçersiz doktor seçimi");
                return;
        }

        for (Randevu randevu : randevuListesi) {
            System.out.println(randevu.toString());
        }}
}