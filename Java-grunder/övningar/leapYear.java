import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ange år: ");
        int year = Integer.valueOf(sc.nextLine());

        if ( year % 4 != 0 ) {
            System.out.println(year + " är ett vanligt år.");
        } else if ( year  % 100 != 0 ) {
            System.out.println(year + " är ett skottår.");
        } else if ( year  % 400 != 0 ) {
            System.out.println(year + " är ett vanligt år.");
        } else {
            System.out.println(year + " är ett skottår.");
        }

    }
}
