package enumeration.ref3;

public class DiscountService {

    public static int discount(Grade grade, int price) {
        return grade.discount(price);
    }
}
