import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //HiLo står för High - Low, och går ut på att datorn slumpar fram ett tal mellan 1 och ett maxtal.
        //Spelaren skall sedan försöka gissa vilket tal datorn tänker på. Om användaren gissar för högt skall spelet säga att gissningen var för hög,
        // och samma om den var för låg. På detta sätt är det tänkt att spelaren skall lista ut vilket tal datorn fick fram vid slumpgenereringen.
        // I den här versionen skall det finns tre olika svårighetsgrader: lätt, mellan och svår. De olika svårighetsgraderna avgör vilket
        // maxtal som programmet kommer att ha när det slumpar ut det rätta svaret.
        //Lätt skall ge ett tal 1-10.
        //Mellan skall ge ett tal 1-100.
        //Svårt skall ge ett tal 1-1000.
        //Användaren skall få välja svårighetsgrad när hen först startar spelet.
        //När en spelomgång har spelats klart skall antalet försök skrivas ut på skärmen.

        Scanner sc = new Scanner(System.in);
        Random slump = new Random();

        int easyRange = slump.nextInt(10);
        int mediumRange = slump.nextInt(100);
        int hardRange = slump.nextInt(1000);

        System.out.println("Select a difficulty level (easy, medium, hard):");
        String level = sc.nextLine();

        if ( level.equals("easy")) {
            System.out.println("Give a number between 1 and 10: ");
            int input = 0;
            int i = 1;

            while ( easyRange != input ) {
                input = Integer.valueOf(sc.nextLine());
                if ( easyRange > input ) {
                    System.out.println("Too low! Try again");
                } else if ( easyRange < input ) {
                    System.out.println("Too high! Try again");
                } else {
                    System.out.println("Correct! It only took you " + i + " tries.");
                    break;
                }
                i++;


            }
        }

        if ( level.equals("medium")) {
            System.out.println("Give a number between 1 and 100: ");
            int input = 0;
            int i = 1;

            while ( mediumRange != input ) {
                input = Integer.valueOf(sc.nextLine());
                if ( mediumRange > input ) {
                    System.out.println("Too low! Try again");
                } else if ( mediumRange < input ) {
                    System.out.println("Too high! Try again");
                } else {
                    System.out.println("Correct! It only took you " + i + " tries.");
                    break;
                }
                i++;


            }
        }

        if ( level.equals("hard")) {
            System.out.println("Give a number between 1 and 1000: ");
            int input =0;
            int i = 1;

            while ( hardRange != input ) {
                input = Integer.valueOf(sc.nextLine());
                if ( hardRange > input ) {
                    System.out.println("Too low! Try again");
                } else if ( easyRange < input ) {
                    System.out.println("Too high! Try again");
                } else {
                    System.out.println("Correct! It only took you " + i + " tries.");
                    break;
                }
                i++;


            }
        }
    }
}
