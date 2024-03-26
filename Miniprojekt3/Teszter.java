import java.util.ArrayList;

public class Teszter {
    public static void main(String[] args) {
        ArrayList<Film> filmek = new ArrayList<>();
        filmek.add(new Film("Star Wars", 1500));
        filmek.add(new Film("The Godfather", 1800));
        filmek.add(new Film("Inception", 2000));
        filmek.add(new HorrorFilm("The Shining", 1700, 16));
        filmek.add(new HorrorFilm("Psycho", 1600, 18));
        filmek.add(new HorrorFilm("The Exorcist", 1550, 18));

        System.out.println("Filmek:");
        for (Film film : filmek) {
            System.out.println(film);
        }

        filmek.sort((f1, f2) -> Double.compare(f1.getAr(), f2.getAr()));

        System.out.println("\nRendezett filmek:");
        for (Film film : filmek) {
            System.out.println(film);
        }

        ArrayList<HorrorFilm> horrorFilmek = new ArrayList<>();
        for (Film film : filmek) {
            if (film instanceof HorrorFilm) {
                horrorFilmek.add((HorrorFilm) film);
            }
        }

        System.out.println("\nHorrorFilm-ek:");
        for (HorrorFilm horrorFilm : horrorFilmek) {
            System.out.println(horrorFilm);
        }

        int eletkor = 10;
        int osszesBuntetes = osszesBuntetesSzamitas(filmek, eletkor);
        System.out.println("\nAz osszes korhataros termek megvasarlasa utan fizetendo buntetes: " + osszesBuntetes);
    }

    public static int osszesBuntetesSzamitas(ArrayList<Film> filmek, int eletkor) {
        int osszeg = 0;
        for (Film film : filmek) {
            if (film instanceof IKorhataros) {
                IKorhataros korhatarosFilm = (IKorhataros) film;
                osszeg += korhatarosFilm.Buntetes(eletkor);
            }
        }
        return osszeg;
    }
}
