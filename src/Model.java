import java.util.ArrayList;
import java.util.List;

public class Model implements IRandevuSistemi {
    private int randevuGunu;
    private int randevuAy;
    private int randevuYil;
    private int randevuSaati;
    private String isim;
    private String sisim;
    private int TC;
    private String Doktor1;
    private String Doktor2;
    private String Doktor3;
    private String Doktor4;





    public Model(int randevuGunu, int randevuAy, int randevuYil, int randevuSaati) {
        this.randevuGunu = randevuGunu;
        this.randevuAy = randevuAy;
        this.randevuYil = randevuYil;
        this.randevuSaati = randevuSaati;

    }

    public String getDoktor1() {
        return Doktor1;
    }

    public void setDoktor1(String doktor1) {
        Doktor1 = doktor1;
    }

    public String getDoktor2() {
        return Doktor2;
    }

    public void setDoktor2(String doktor2) {
        Doktor2 = doktor2;
    }

    public String getDoktor3() {
        return Doktor3;
    }

    public void setDoktor3(String doktor3) {
        Doktor3 = doktor3;
    }

    public String getDoktor4() {
        return Doktor4;
    }

    public void setDoktor4(String doktor4) {
        Doktor4 = doktor4;
    }

    public int getRandevuGunu() {
        return randevuGunu;
    }

    public void setRandevuGunu(int randevuGunu) {
        this.randevuGunu = randevuGunu;
    }

    public int getRandevuAy() {
        return randevuAy;
    }

    public void setRandevuAy(int randevuAy) {
        this.randevuAy = randevuAy;
    }

    public int getRandevuYil() {
        return randevuYil;
    }

    public void setRandevuYil(int randevuYil) {
        this.randevuYil = randevuYil;
    }

    public int getRandevuSaati() {
        return randevuSaati;
    }

    public void setRandevuSaati(int randevuSaati) {
        this.randevuSaati = randevuSaati;
    }
    public boolean isRandevuMevcut(Model imodel) {

        Controller controller=new Controller();

        Takvim1 takvim1 = new Takvim1();
        Takvim2 takvim2 = new Takvim2();
        Takvim3 takvim3 = new Takvim3();// Takvim sınıfı randevu saatlerini içeren bir takvim oluşturur
        List<Randevu> randevuListesi1 = takvim1.getRandevuListesi(); // Takvimden randevu listesini alır
        List<Randevu> randevuListesi2 = takvim2.getRandevuListesi();
        List<Randevu> randevuListesi3 = takvim3.getRandevuListesi();
        if(controller.HangiSayi(imodel)==1)
        {
            for (Randevu randevu : randevuListesi1) {
                if (randevu.getGun() == imodel.getRandevuGunu() &&
                        randevu.getAy() == imodel.getRandevuAy() &&
                        randevu.getYil() == imodel.getRandevuYil() &&
                        randevu.getSaat() == imodel.getRandevuSaati()) {

                    return false;
                }
            }
            return true;
        }
        if(controller.HangiSayi(imodel)==2)
        {
            for (Randevu randevu : randevuListesi2) {
                if (randevu.getGun() == imodel.getRandevuGunu() &&
                        randevu.getAy() == imodel.getRandevuAy() &&
                        randevu.getYil() == imodel.getRandevuYil() &&
                        randevu.getSaat() == imodel.getRandevuSaati()) {

                    return false;
                }
            }
            return true;
        }
        if(controller.HangiSayi(imodel)==3)
        {
            for (Randevu randevu : randevuListesi3) {
                if (randevu.getGun() == imodel.getRandevuGunu() &&
                        randevu.getAy() == imodel.getRandevuAy() &&
                        randevu.getYil() == imodel.getRandevuYil() &&
                        randevu.getSaat() == imodel.getRandevuSaati()) {

                    return false;
                }
            }
            return true;
        }


        return true;
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSisim() {
        return sisim;
    }

    public void setSisim(String sisim) {
        this.sisim = sisim;
    }

    public int getTC() {
        return TC;
    }

    public void setTC(int TC) {
        this.TC = TC;
    }



}