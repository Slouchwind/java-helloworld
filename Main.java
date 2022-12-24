import java.util.function.Function;

public class Main {
    public static <E> void logArray(E[] array) {
        for (E element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void logArray(Function<Integer, String> mapFunction, Integer num) {
        for (int i = 0; i <= num; i++) {
            System.out.printf("%s ", mapFunction.apply(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        logArray(new String[] { "Hello", new HelloJava("Java", false).toString() });
        logArray(args);
        logArray((num) -> {
            return num.toString();
        }, 5);
    }
}