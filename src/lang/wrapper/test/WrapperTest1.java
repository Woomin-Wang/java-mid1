package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

//        Integer value1 = Integer.valueOf(str1);
//        Integer value2 = Integer.valueOf(str2);
        int value1 = Integer.parseInt(str1);
        int value2 = Integer.parseInt(str2);

        int result = value1 + value2;

        System.out.println("두수의 합: " + result);
    }
}
