package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int intValue2 = integer1.intValue();
        System.out.println("intValue2 = " + intValue2);

        Integer integer2 = Integer.valueOf(intValue2);
        System.out.println("integer2 = " + integer2);

    }
}
