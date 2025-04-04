package enumeration.ex0;

public class StringGradeEx0_2 {
    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 금액
        int vip = discountService.discount("VIP", price);
        System.out.println("vip 할인금액 = " + vip);
        System.out.println();

        //오타
        int diamond1 = discountService.discount("DIAMONDD", price);
        System.out.println("diamond 할인금액 = " + diamond1);
        System.out.println();


        //소문자 입력
        int gold1 = discountService.discount("gold", price);
        System.out.println("gold 할인금액 = " + gold1);
        System.out.println();


    }
}
