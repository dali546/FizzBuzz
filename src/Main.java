import java.io.IOException;
import java.sql.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int i;
        for (i = 1; i <= 300; i++) {
            boolean Fizz, Buzz, Bang, Bong, Fezz, reverse;
            Fizz = Buzz = Bang = Bong = Fezz = reverse = false;

            if (i % 3 == 0) {
                Fizz = true;
            }
            if (i % 5 == 0) {
                Buzz = true;
            }
            if (i % 7 == 0) {
                Bang = true;
            }
            if (i % 11 == 0) {
                Bong = true;
            }
            if (i % 13 == 0) {
                Fezz = true;
            }
            if (i % 17 == 0) {
                reverse = true;
            }
            StringBuilder stringBuilder = new StringBuilder();
            List<String> strings = new ArrayList<>();
            if (Fizz) {
                strings.add("Fizz");
            }
            if (Fezz) {
                strings.add("Fezz");
            }
            if (Buzz) {
                strings.add("Buzz");
            }
            if (Bang) {
                strings.add("Bang");
            }
            if (Bong) {
                strings.clear();
                strings.add("Bong");
            }
            if (reverse) {
                Collections.reverse(strings);
            }

            for (String str : strings) {
                stringBuilder.append(str);
            }
            if (!strings.isEmpty()) {
                System.out.println(stringBuilder.toString() + ": " + i);
            } else {
                System.out.println("This number is Dumb: " + i);
            }
        }
    }
}

class CountToMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ok You want me to count upto a number." +
                "What number do you want me to count to?");
        try{
            int i = scanner.nextInt();
            System.out.println("Ok *breaths*");
            for (int j=0;j<=i;j++) {
                System.out.println(j);
            }
        } catch (InputMismatchException e){
            System.out.println("Use some common sense. Enter a NUMBER");
        }
    }
}