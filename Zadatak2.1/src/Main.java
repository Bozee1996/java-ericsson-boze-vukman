import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite niz znakova:");
        String input = scanner.nextLine();

        int letters = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                letters++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else {
                others++;
            }
        }

        // ispis rezultata
        System.out.printf("Slova: %d%n", letters);
        System.out.printf("Brojevi: %d%n", digits);
        System.out.printf("Ostali znakovi: %d%n", others);
    }
}