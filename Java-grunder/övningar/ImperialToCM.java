import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1 famn = 178cm
        //1 aln = 59cm
        //1 tum = 2,4cm
        //1 fot = 29cm
        Scanner sc = new Scanner(System.in);

        System.out.println("Ange längd i famnar: ");
        int famnar = Integer.valueOf(sc.nextLine());
        System.out.println("Ange längd i alnar: ");
        int alnar = Integer.valueOf(sc.nextLine());
        System.out.println("Ange längd i tummar: ");
        int tummar = Integer.valueOf(sc.nextLine());
        System.out.println("Ange längd i fötter: ");
        int feets = Integer.valueOf(sc.nextLine());

        System.out.println(famnar + " famnar = " + famnar*178 + " cm.");
        System.out.println(alnar + " alnar = " + alnar*59 + " cm.");
        System.out.println(tummar + " tummar = " + 1.0*tummar*2.4 + " cm.");
        System.out.println(feets + " fötter = " + feets*29 + " cm.");

    }
}
