package by_aqa_q1822_final_task.RealisationListForSelectingActions;

import by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.User;
import by_aqa_q1822_final_task.MenuForSelectingActions.SelectingAnItemFromTheList;
import by_aqa_q1822_final_task.Read_file_book_data;

@User
public class RealisationListForSelectingActionsForUser implements SelectingAnItemFromTheList {
    private static boolean endFlag = true;

    @Override
    public int selectingAnItemFromTheList() {
        return SelectingAnItemFromTheList.super.selectingAnItemFromTheList();
    }

    public void ImplementationListForSelectingActionsUser() {
        int theItem = selectingAnItemFromTheList();
        Read_file_book_data read_file_book_data = new Read_file_book_data();
        switch (theItem) {
            case 1: {
                read_file_book_data.file_reader();
                break;
            }
            case 2:{

                break;
            }
            case 5: {
                endFlag = false;
            }

        }
    }
}
