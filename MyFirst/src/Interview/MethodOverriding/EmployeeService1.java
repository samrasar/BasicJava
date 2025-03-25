package Interview.MethodOverriding;

import java.sql.SQLException;

public class EmployeeService1 extends EmployeeService{
    @Override
    public Employee getEmployee(String name)throws SQLException {
        System.out.println("es1");
        //return null;
        return null;
    }
}
