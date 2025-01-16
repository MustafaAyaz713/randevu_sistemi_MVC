import java.util.List;
import java.util.Scanner;

public class Controller  implements IRandevuSistemi {

    @Override
    public boolean isRandevuMevcut(Model imodel) {

        Takvim takvim;
        int doktorId = HangiSayi(imodel);
        if (doktorId == 4) {
            System.out.println("------------");
        }
        if (doktorId == 1) {
            takvim = new Takvim1();
        } else if (doktorId == 2) {
            takvim = new Takvim2();
        } else if (doktorId == 3) {
            takvim = new Takvim3();
        } else {

            return false;

        }

        List<Randevu> randevuListesi = takvim.getRandevuListesi(); // Takvimden randevu listesini alır

        for (Randevu randevu : randevuListesi) {
            if (randevu.getGun() == imodel.getRandevuGunu() &&
                    randevu.getAy() == imodel.getRandevuAy() &&
                    randevu.getYil() == imodel.getRandevuYil() &&
                    randevu.getSaat() == imodel.getRandevuSaati()) {
                // Eğer randevu mevcutsa false döndür
                return false;
            }
        }

        return true;
    }

    public int HangiSayi(Model imodel) {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.println("Bu doktora randevu almak istediniz:");

        if (n == 1) {
            System.out.println(imodel.getDoktor1());
        } else if (n == 2) {
            System.out.println(imodel.getDoktor2());
        } else if (n == 3) {
            System.out.println(imodel.getDoktor3());
        } else if (n == 4) {
            System.out.println(imodel.getDoktor4());
        } else {
            System.out.println("Geçersiz doktor seçimi, Lütfen doğru numara giriniz");
            n = x.nextInt();
            System.out.println("Bu doktora randevu almak istediniz:");

            if (n == 1) {
                System.out.println(imodel.getDoktor1());
            } else if (n == 2) {
                System.out.println(imodel.getDoktor2());
            } else if (n == 3) {
                System.out.println(imodel.getDoktor3());
            } else {
                System.out.println("Geçersiz doktor seçimi, Lütfen doğru numara giriniz,Son hakkınız");
                n = x.nextInt();
                System.out.println("Bu doktora randevu almak istediniz:");

                if (n == 1) {
                    System.out.println(imodel.getDoktor1());
                } else if (n == 2) {
                    System.out.println(imodel.getDoktor2());
                } else if (n == 3) {
                    System.out.println(imodel.getDoktor3());
                } else {
                    System.out.println("Geçersiz doktor seçimi, Lütfen doğru numara giriniz");
                    System.exit(0);


                    return 0;
                }


                return 0;
            }

            return 0;
        }

        return n;
    }
}