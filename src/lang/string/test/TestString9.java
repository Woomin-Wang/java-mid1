package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] a = email.split("@");

        System.out.println(a[0]);
        System.out.println(a[1]);
    }
}
