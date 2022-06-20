import TestCaseAssert.ApiTestValue;
import TestCaseAssert.DocumentationAssert;
import TestCaseAssert.RegisterAsseert;

public class Storage {

    RegisterAsseert registerAsseert = new RegisterAsseert();
    ApiTestValue apiTestValue = new ApiTestValue();
    DocumentationAssert documentationAssert = new DocumentationAssert();

    Storage() {
        apiTestValue.fillApi();
        registerAsseert.fillRegister();
        documentationAssert.fillRegister();

    }


}
