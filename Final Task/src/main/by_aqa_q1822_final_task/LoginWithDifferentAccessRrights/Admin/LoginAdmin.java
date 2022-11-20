package by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.Admin;

import by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.AnnotationAdminAndUser.Admin;
import by_aqa_q1822_final_task.LoginWithDifferentAccessRrights.LoginInSystem;

public class LoginAdmin implements LoginInSystem {
    @Admin
    @Override
    public void methodForLoginInSystem() {
        LoginInSystem.super.methodForLoginInSystem();
    }
}
