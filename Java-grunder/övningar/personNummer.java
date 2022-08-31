import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        //Uppgift 3:
        //Skriv ett program som kollar om inmatad sträng är ett giltigt personnummer.

        Scanner sc = new Scanner(System.in);
        System.out.println("Ange personnummer (12 siffror):");
        String pnInput = sc.nextLine();

        //Skapar en stränglista med enskilda siffror
        String[] numbers = pnInput.split("");
        System.out.println(Arrays.toString(numbers));

        //Skapar en tom integerlista
        ArrayList<Integer> intList = new ArrayList<Integer>();

        //Parsear stränglistan och lägger till integer till en ny integerlistan
        for (int i = 0; i < numbers.length-1; i++) {
            intList.add(parseInt(numbers[i]));
        }

        //Luhn-algoritmen
        int sum = intList.get(2) *2 + intList.get(3) + intList.get(4) *2 + intList.get(5) + intList.get(6) *2 + intList.get(7) + intList.get(8) *2 + intList.get(9);
        if (sum % 10 == 0) {
            System.out.println("Personnumret är giltigt");
        } else {
            System.out.println("Personnumret är inte giltigt");
        }

    }
}
