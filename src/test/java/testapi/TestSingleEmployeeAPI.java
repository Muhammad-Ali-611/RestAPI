package testapi;

import employee.services.SingleEmployee;
import org.junit.Test;

public class TestSingleEmployeeAPI extends SingleEmployee {

    @Test
    public void singleEmployeeValidCall() {
        getAllEmployeeRecourcesAPIValidCall();
    }

    public void singleEmployeeInValidCall() {
        getAllEmployeeRecourcesAPIInValidCall();
    }

    }

