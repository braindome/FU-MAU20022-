public class Main {
    public static void main(String[] args) {

        //Skriv programmet FizzBuzz, ett program som skriver ut heltalen 1-100.
        //men när talet är jämnt delbart med 3: skriv bara ut Fizz
        //men när talet är jämnt delbart med 5: skriv bara ut Buzz
        //men när talet är jämnt delbart med 3 och 5: skriv bara ut FizzBuzz
        

        for (int i = 1; i <= 100; i++) {

            if ( i % 3 == 0 && i % 2 == 0) {
                System.out.println("Fizz");
            } else if ( i % 5 == 0 && i % 2 == 0 ) {
                System.out.println("Buzz");
            } else if ( i % 3 == 0 && i % 5 == 0 && i % 2 == 0 ) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }

        }
    }
}
