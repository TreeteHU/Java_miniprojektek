import java.util.ArrayList;
import java.util.List;

public class RegularisSzamla implements BankSzamla{
    protected double egyenleg;
    protected String tulNev;
    protected int szamlaSzam;
    protected static int kovSzamlaSzam=1;
    protected List<Tranzakcio> tranzakciok;

    public RegularisSzamla(String tulNev) {
        this.tulNev=tulNev;
        this.szamlaSzam=ujSzamlaSzam();
        this.egyenleg=0.0;
        this.tranzakciok=new ArrayList<>();
    }

    public static int ujSzamlaSzam() {
        return kovSzamlaSzam=kovSzamlaSzam+1;
    }

    @Override
    public void betesz(double osszeg){
        egyenleg+=osszeg;
        Tranzakcio tranzakcio = new Tranzakcio(TranzakcioTipus.DEPOSIT, osszeg);
        tranzakciok.add(tranzakcio);
    }

    @Override
    public double getEgyenleg() {
        return egyenleg;
    }

    @Override
    public void kivesz(double osszeg){
        egyenleg-=osszeg;
        Tranzakcio tranzakcio = new Tranzakcio(TranzakcioTipus.WITHDRAW, osszeg);
        tranzakciok.add(tranzakcio);
    }

    public List<Tranzakcio> getTranzakciok(){
        return tranzakciok;
    }
    @Override
    public String toString(){
        return "Szamlaszam: " + szamlaSzam+", Tulajdonos neve: "+tulNev+",Egyenleg "+egyenleg+", Tranzakciok: "+tranzakciok;
    }
}





