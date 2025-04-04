package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] groups = AuthGrade.values();
        for(AuthGrade group : groups) {
            System.out.println("grade=" + group.name() + ", level=" + group.getLevel() + ", 설명=" + group.getDescription());
        }


    }
}
