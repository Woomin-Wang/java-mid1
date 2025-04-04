package enumeration.ref2;

public class DiscountService {

    public static int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
