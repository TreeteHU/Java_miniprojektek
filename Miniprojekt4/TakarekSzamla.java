import java.util.Objects;

public class TakarekSzamla extends RegularisSzamla {
    protected double kamatRata;
    public TakarekSzamla(String tulNev, double kamatRata){
        super(tulNev);
        this.kamatRata=kamatRata;
    }
    public void setKamatRata(double kamatRata){
        this.kamatRata=kamatRata;
    }
    public double getKamatRata(){
        return kamatRata;
    }
    public void hozzaadKamat(){
        egyenleg+=egyenleg*kamatRata/100;
    }
    @Override
    public boolean equals(Object o){
        if (this==o) return true;
        if (!(o instanceof FolyoSzamla that)) return false;
        return Objects.equals(tulNev, that.tulNev) 
        && Objects.equals(kamatRata, that.kamatRata) 
        && Objects.equals(szamlaSzam, that.szamlaSzam);
    }
}
