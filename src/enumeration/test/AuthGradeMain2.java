package enumeration.test;

import enumeration.ref3.Grade;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AuthGrade[] grades = AuthGrade.values();

        System.out.print("당신의 등급을 입력하세요" + Arrays.toString(grades) + ":");
        String input = scanner.nextLine();
        AuthGrade grade = AuthGrade.valueOf(input.toUpperCase());

        AuthGrade.printMenu(grade);



    }
}
