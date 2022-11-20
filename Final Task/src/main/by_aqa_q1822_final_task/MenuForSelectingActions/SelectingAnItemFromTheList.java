package by_aqa_q1822_final_task.MenuForSelectingActions;

import java.util.Scanner;

public interface SelectingAnItemFromTheList {
    String ANSI_BLUE = "\u001B[34m";

     default int selectingAnItemFromTheList() {
         System.out.println(ANSI_BLUE + "Please select the item corresponding to the action you want to take: ");
         return new Scanner(System.in).nextInt();
     }
}
