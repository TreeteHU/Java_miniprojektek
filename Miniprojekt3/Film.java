public class Film {
    private String cim;
    private double ar;
    private int[] velemenyek;
    private int velemenyekSzama;

    public Film(String cim, double ar) {
        this.cim = cim;
        this.ar = ar;
        this.velemenyek = new int[20];
        this.velemenyekSzama = 0;
    }

    public String getCim() {
        return cim;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public void Velemenyezes(int velemeny) {
        if (velemenyekSzama < 20) {
            velemenyek[velemenyekSzama] = velemeny;
            velemenyekSzama++;
        } else {
            System.out.println("Maximum 20 velemeny tarolhato!");
        }
    }

    public double Atlag() {
        if (velemenyekSzama == 0) {
            System.out.println("A film meg nem kapott velemenyt.");
            return 0;
        }
        double osszeg = 0;
        for (int i = 0; i < velemenyekSzama; i++) {
            osszeg += velemenyek[i];
        }
        return osszeg / velemenyekSzama;
    }

    @Override
    public String toString() {
        return "Film cime: " + cim + ", Film ara: " + ar;
    }
}

