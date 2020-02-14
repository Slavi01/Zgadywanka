import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Quiz {

//        tutaj strasznie namieszałem komentarzem Sławku

        public static void main(String[] args) throws NumberFormatException, IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            boolean statusLooking = false;
            int tryNumber = 1;
            Random randomize = new Random();
            int lookingNumber = randomize.nextInt(100);
            while (statusLooking == false) {
                System.out.print("Wymyśliłem sobie liczbę z zakresu 0-100. Zgadnij co to za liczba. Będę udzielał Ci wskazówek. Podaj liczbę z tego zakresu tutaj : ");
                int numberEntered = Integer.parseInt(reader.readLine());
                if (lookingNumber == numberEntered) {
                    System.out.println("BRAWOOOOOOO zgadłeś!!!!!! To właśnie liczbę " + lookingNumber + " wymyśliłem");
                    statusLooking = true;
                } else if (numberEntered > lookingNumber) {
                    System.out.println("Podałeś liczbę zbyt dużą, podaj mniejszą.");
                    statusLooking = false;
                    tryNumber++;
                } else if (numberEntered < lookingNumber) {
                    System.out.println("Podałeś liczbę zbyt małą, podaj większą.");
                    statusLooking = false;
                    tryNumber++;
                }
            }
            System.out.println("Na ustalenie jaką liczbę wymyśliłem potrzebowałeś " + tryNumber + " prób.");
        }
    }



