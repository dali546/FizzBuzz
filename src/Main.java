import java.sql.Array;

public class Main {

    public static void main(String[] args) {
        int i;

        for (i = 1; i <= 300; i++) {
            boolean Fizz = false;
            boolean Buzz = false;
            boolean Bang = false;
            boolean Bong = false;
            boolean Fezz = false;
            boolean reverse = false;

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
            if (i % 17 == 0){
                reverse = true;
            }

            StringBuilder stringBuilder = new StringBuilder();
            if (Fizz) {
                stringBuilder.append("Fizz");
            }
            if (Buzz) {
                stringBuilder.append("Buzz");
            }
            if (Bang) {
                stringBuilder.append("Bang");
            }
            if (Bong) {
                stringBuilder.replace(0, stringBuilder.length(), "Bong");
            }
            if (Fezz) {
                stringBuilder.insert(
                        (stringBuilder.indexOf("B") == -1 ? 0 : stringBuilder.indexOf("B")),
                        "Fezz"
                );
            }
            if (reverse) {
                String[] arr = stringBuilder.toString().split("(?<=\\G...)");
                stringBuilder.replace(0,stringBuilder.length(), arr[]);
            }
            System.out.println(stringBuilder);
            System.out.println(i);
        }
    }
}
