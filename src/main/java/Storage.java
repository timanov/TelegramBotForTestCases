import TestCaseAssert.ApiTestValue;
import TestCaseAssert.RegisterFormValue;

import java.util.ArrayList;

public class Storage {

    RegisterFormValue registerFormValue = new RegisterFormValue();
    ApiTestValue apiTestValue = new ApiTestValue();

    Storage() {
        apiTestValue.fillApi();
        registerFormValue.fillRegister();

    }
}
