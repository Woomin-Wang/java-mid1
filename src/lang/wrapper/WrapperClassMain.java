package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);
        Integer intergerObj1 = Integer.valueOf(10);
        Integer intergerObj2= Integer.valueOf(10);
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("interObj = " + intergerObj1);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);
        System.out.println();

        System.out.println("내부 값 일기");
        int intValue = intergerObj1.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);
        System.out.println();

        System.out.println("비교");
        System.out.println("newInteger == intergerObj1: " + (newInteger == intergerObj1));
        System.out.println("newInteger.equals(integerObj1): " + (newInteger.equals(intergerObj1)));
        System.out.println("intergerObj1 == intergerObj2: " + (intergerObj2 == intergerObj2));

    }
}
