package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int i = str.indexOf(ext);
        String result1 = str.substring(0, i);
        String result2 = str.substring(i);

        System.out.println(result1);
        System.out.println(result2);


    }
}
