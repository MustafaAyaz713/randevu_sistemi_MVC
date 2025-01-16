public class Randevu {
    private int gun;
    private int ay;
    private int yil;
    private int saat;

    public Randevu(int gun, int ay, int yil, int saat) {
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;
        this.saat = saat;
    }


    @Override
    public String toString() {
        return "Randevu Tarihi: " + gun + "/" + ay + "/" + yil + ", Saat: " + saat;
    }



    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    public int getAy() {
        return ay;
    }

    public void setAy(int ay) {
        this.ay = ay;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public int getSaat() {
        return saat;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }
}