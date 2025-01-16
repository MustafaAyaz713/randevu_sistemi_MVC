import java.util.Scanner;

public class sistem {
    private Takvim1 takvim1;
    private Takvim2 takvim2;
    private Takvim3 takvim3;

    public sistem() {
        takvim1 = new Takvim1();
        takvim2 = new Takvim2();
        takvim3 = new Takvim3();
    }

    public void secenekSec() {
        Scanner scanner = new Scanner(System.in);
        View view = new View();


        while (true) {
            System.out.println("1 - Randevu Al");
            System.out.println("2 - Randevuları Görüntüle");
            System.out.println("3 - Çıkış");

            String secenek = scanner.nextLine();

            if ("1".equals(secenek)) {
                System.out.print("Randevu Günü: ");
                int gun = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Randevu Ayı: ");
                int ay = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Randevu Yılı: ");
                int yil = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Randevu Saati: ");
                int saat = scanner.nextInt();
                scanner.nextLine();

                if (ay < 1 || ay > 12 || gun < 1 || gun > 31 || saat < 0 || saat > 23) {
                    System.out.println("Geçersiz tarih veya saat. Lütfen tekrar deneyin.");
                    continue;
                }

                Model imodel = new Model(gun, ay, yil, saat);


                int doktorSecimi = view.DoktorGoruntule(imodel);

                Randevu yeniRandevu = new Randevu(gun, ay, yil, saat);
                switch (doktorSecimi) {
                    case 1:
                        takvim1.getRandevuListesi().add(yeniRandevu);
                        System.out.println("Randevunuz başarıyla alındı.");
                        break;
                    case 2:
                        takvim2.getRandevuListesi().add(yeniRandevu);
                        System.out.println("Randevunuz başarıyla alındı.");
                        break;
                    case 3:
                        takvim3.getRandevuListesi().add(yeniRandevu);
                        System.out.println("Randevunuz başarıyla alındı.");
                        break;
                    default:
                        System.out.println("Geçersiz doktor seçimi");
                        break;
                }
            } else if ("2".equals(secenek)) {
                view.randevulariGoruntule(takvim1, takvim2, takvim3);
            } else if ("3".equals(secenek)) {
                break;
            } else {
                System.out.println("Lütfen geçerli bir seçenek girin.");
            }
        }
    }}
