package by_aqa_q1822_final_task.LoginWithDifferentAccessRrights;

import java.util.Scanner;

public interface LoginInSystem {
    int passwordAdmin = 1234;
    int passwordUser = 4321;

    static int enteringDataAtlogin() {
        System.out.println("Please enter password: ");
        return new Scanner(System.in).nextInt();
    }

    default void methodForLoginInSystem() {
        if (passwordAdmin == enteringDataAtlogin()) {
            System.out.println("Welcome, Admin!");
        }
        if (passwordUser == enteringDataAtlogin()) {
            System.out.println("Welcome, User!");
        } else {
            System.out.println("Error! Password incorrect!");
        }
    }
}
