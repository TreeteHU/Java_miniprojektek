import java.util.Objects;

public class FolyoSzamla extends RegularisSzamla {
    protected int tranzakciokSzama;
    protected static int ingyenesTranzakciokSzama = 3;
    protected static double tranzakcioAra = 2;

    public FolyoSzamla(String tulNev){
        super(tulNev);
        this.tranzakciokSzama = 0;
    }
    @Override
    public void kivesz(double osszeg) {
        tranzakciokSzama++;
        super.kivesz(osszeg);
    }
    @Override
    public void betesz(double osszeg) {
        tranzakciokSzama++;
        super.betesz(osszeg);
    }
    public void levonKoltseg(){
        if (tranzakciokSzama > ingyenesTranzakciokSzama){
            double levonOsszeg = tranzakcioAra * (tranzakciokSzama - ingyenesTranzakciokSzama);
            egyenleg -= levonOsszeg;
        }
        tranzakciokSzama = 0;
    }
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof FolyoSzamla that)) return false;
        return Object.equals(tulNev, that.tulNev) 
        && Objects.equals(tranzakciokSzama, that.tranzakciokSzama)
        && Objects.equals(szamlaSzam, that.szamlaSzam);
    }
}
