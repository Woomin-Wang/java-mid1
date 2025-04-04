package enumeration.test;

public enum AuthGrade {

    GUEST(1, "손님"),
    LOGIN(2, "로그인 회원"),
    ADMIN(3, "관리자");

    private final int level;
    private final String description;

    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }

    public static void printGuest(AuthGrade authGrade) {
        System.out.println("당신의 등급은 " + authGrade + "입니다.");
        System.out.println("==메뉴 목록==");
        System.out.println("- 메인 화면");
    }

    public static void printLogin(AuthGrade authGrade) {
        printGuest(authGrade);
        System.out.println("- 이메일 관리 화면");
    }

    public static void printAdmin(AuthGrade authGrade) {
        printLogin(authGrade);
        System.out.println("- 관리자 화면");
    }

    public static void printMenu(AuthGrade authGrade) {
        if (authGrade == GUEST) {
            printGuest(authGrade);
        } else if (authGrade == LOGIN) {
            printLogin(authGrade);
        } else printAdmin(authGrade);
    }


}
