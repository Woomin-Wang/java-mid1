package enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // 자동으로 private
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 3번째 Ref
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
