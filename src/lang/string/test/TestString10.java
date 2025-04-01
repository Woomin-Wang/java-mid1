package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] fruitArr = fruits.split(",");

        for (String string : fruitArr) {
            System.out.println(string);
        }

        String join = String.join("->", fruitArr);
        System.out.println(join);
    }
}
