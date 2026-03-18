public class PrviZadatak {

    public static void main(String[] args) {

        for (int i = 1; i <= 9999; i++) {
            int broj = i;
            int suma = 0;

            while (broj > 0) {
                int znamenka = broj % 10;
                suma += znamenka * znamenka * znamenka;
                broj /= 10;
            }

            if (suma == i) {
                System.out.println(i);
            }
        }
    }
}
