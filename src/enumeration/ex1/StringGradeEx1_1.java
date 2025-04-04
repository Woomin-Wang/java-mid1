package enumeration.ex1;

public class StringGradeEx1_1 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(StringGrade.BASIC, price);
        int gold = discountService.discount(StringGrade.GOLD, price);
        int diamond = discountService.discount(StringGrade.DIAMOND, price);

        System.out.println("basic 할인금액 = " + basic);
        System.out.println("gold 할인금액 = " + gold);
        System.out.println("diamond 할인금액 = " + diamond);

        //존재하지 않는 금액
        int vip = discountService.discount("VIP", price);
        System.out.println("vip 할인금액 = " + vip);

        //오타
        int diamond1 = discountService.discount("DIAMONDD", price);
        System.out.println("diamond 할인금액 = " + diamond1);

        //소문자 입력
        int gold1 = discountService.discount("gold", price);
        System.out.println("gold 할인금액 = " + gold1);

    }
}
