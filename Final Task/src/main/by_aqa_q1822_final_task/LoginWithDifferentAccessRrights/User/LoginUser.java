package by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.User;

import by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.User;
import by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.LoginInSystem;

public class LoginUser implements LoginInSystem {
    @User
    @Override
    public void methodForLoginInSystem() {
        LoginInSystem.super.methodForLoginInSystem();
    }
}
