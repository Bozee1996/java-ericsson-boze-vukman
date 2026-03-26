import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<GeometrijskiLik> likovi = new ArrayList<>();

        // Dodavanje likova
        likovi.add(new Trokut("Trokut1", 3, 4, 5));
        likovi.add(new Krug("Krug1", 2.5));
        likovi.add(new Pravokutnik("Pravokutnik1", 4, 6));

        // Ispis prije sortiranja
        System.out.println("=== Svi likovi ===");
        for (GeometrijskiLik lik : likovi) {
            System.out.println(lik.getNaziv() +
                    " | Povrsina: " + lik.povrsina() +
                    " | Opseg: " + lik.opseg());
        }

        // Sortiranje po površini
        likovi.sort(Comparator.comparingDouble(GeometrijskiLik::povrsina));

        // Ispis nakon sortiranja
        System.out.println("\n=== Sortirano po povrsini ===");
        for (GeometrijskiLik lik : likovi) {
            System.out.println(lik.getNaziv() +
                    " | Povrsina: " + lik.povrsina() +
                    " | Opseg: " + lik.opseg());
        }
    }
}