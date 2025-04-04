package enumeration.ex2;

public class Grade {

    public static final Grade BASIC = new Grade();
    public static final Grade GOLD = new Grade();
    public static final Grade DIAMOND = new Grade();

    //private 생성자 추가
    private Grade() {}
}
