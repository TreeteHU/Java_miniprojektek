import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

enum TranzakcioTipus {DEPOSIT, WITHDRAW}

public class Tranzakcio{
    protected LocalDateTime idopont;
    protected TranzakcioTipus tranzTipus;
    protected double osszeg;

    public Tranzakcio(TranzakcioTipus tranzTipus, double osszeg) {
        this.tranzTipus=tranzTipus;
        this.osszeg=osszeg;
        this.idopont=LocalDateTime.now();
    }
    public TranzakcioTipus geTranzakcioTipus(){
        return tranzTipus;
    }
    @Override
    public String toString(){
        return "Tranztipus: "+tranzTipus+", Összeg: "+osszeg+", Időpont: "+idopont.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
    }
}