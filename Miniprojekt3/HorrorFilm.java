public class HorrorFilm extends Film implements IKorhataros {
    private int korh;

    public HorrorFilm(String cim, double ar, int korh) {
        super(cim, ar);
        this.korh = korh;
    }

    @Override
    public int Korhatar() {
        return korh;
    }

    @Override
    public int Buntetes(int kor) {
        if (kor < korh) {
            return (korh - kor) * (int) getAr();
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Korhatar: " + korh;
    }
}
