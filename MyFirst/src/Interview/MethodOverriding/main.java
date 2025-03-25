package Interview.MethodOverriding;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws Exception {
        String name = "abc";
        EmployeeService1 es1= new EmployeeService1();
        es1.getEmployee(name);
    }
}
