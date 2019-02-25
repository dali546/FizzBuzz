import java.io.StringReader;
import java.util.*;

public class Main {

    /**
     * FizzBuzz Challenge... The Bane of New Programmers Existence
     *
     * @param args - Arguments this Program can take
     *             args[0] - Pick from 3,5,7,11,13,17 - seperate with ','
     */
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList = Arrays.asList(args[0].split(","));
        System.out.println("You requested the following options: " + stringList.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ok You want me to count upto a number." +
                "What number do you want me to count to?");

        try {
            int k = scanner.nextInt();
            System.out.println("Ok *breaths*");
            for (int i = 1; i <= k; i++) {
                boolean Fizz, Buzz, Bang, Bong, Fezz, reverse;
                Fizz = Buzz = Bang = Bong = Fezz = reverse = false;

                if (i % 3 == 0 && stringList.contains("3")) {
                    Fizz = true;
                }
                if (i % 5 == 0 && stringList.contains("5")) {
                    Buzz = true;
                }
                if (i % 7 == 0 && stringList.contains("7")) {
                    Bang = true;
                }
                if (i % 11 == 0 && stringList.contains("11")) {
                    Bong = true;
                }
                if (i % 13 == 0 && stringList.contains("13")) {
                    Fezz = true;
                }
                if (i % 17 == 0 && stringList.contains("17")) {
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
        } catch (InputMismatchException e) {
            System.out.println("Use some common sense. Enter a NUMBER");
        }
    }
}