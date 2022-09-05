import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;
import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Välkommen till menyn! Här kan du göra massor.");
        System.out.println("Vad vill du göra?");
        System.out.println("1. Addera två tal");
        System.out.println("2. Räkna bokstäver i en sträng");
        System.out.println("3. Spegelvänd en sträng");
        System.out.println("4. Summera alla tal i en sträng");
        System.out.println("e. Avsluta");

        Scanner sc = new Scanner(in);

        while (true) {

            String choice = String.valueOf(sc.nextLine());
            if (choice.equals("1")) {
                System.out.println("Här adderar vi två tal");
                System.out.println("Ange första talet:");
                int first = parseInt(sc.nextLine());
                System.out.println("Ange andra talet:");
                int second = parseInt(sc.nextLine());
                System.out.println("Summan är " + sum(first, second));
            } else if (choice.equals("2")) {
                System.out.println("Ange ord du vill leta i: ");
                String word = String.valueOf(sc.nextLine());
                System.out.println("Ange bokstaven du vill leta efter: ");
                char c = sc.nextLine().charAt(0);
                int number = numberOfCharacters(word, c);
                System.out.println("Det finns " + number + " " + "'" + c +  "'" + " i " + word);
            } else if (choice.equals("3")) {
                System.out.println("Skriv in en sträng: ");
                String inputString = String.valueOf(sc.nextLine());
                mirror(inputString);
            } else if (choice.equals("4")) {
                System.out.println("Skriv in en sträng");
                String inputString = String.valueOf(sc.nextLine());
                System.out.println(sumOfElements(inputString));
            } else if (choice.equals("e")) {
                System.out.println("Hej då!");
                break;
            }
            System.out.println("Vad vill du göra nu?");
        }

    }

    static int sum (int first, int second) {
        return first + second;
    }

    static int numberOfCharacters (String word, char c) {
        int totalChars = 0;
        char temp;
        for (int i = 0; i < word.length(); i++) {
            temp = word.charAt(i);
            if (temp == c) {
                totalChars++;
            }
        }
        return totalChars;

    }

    static void mirror (String word) {
        String rev = "";
        for (int i = word.length()-1; i >= 0; i--) {
            rev = rev + word.charAt(i);
        }
        System.out.println(rev);
    }

    static int sumOfElements (String input) {
        String[] numberList = input.split("");
        ArrayList<Integer> intList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            intList.add(parseInt(numberList[i]));
            sum = sum + intList.get(i);
        }
        return sum;
    }
}
