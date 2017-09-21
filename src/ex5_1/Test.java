package ex5_1;

public class Test {

    public static void main(String[] args) {
        Employee emp = new Manager("Adam");
        System.out.println(emp.getInfo());
        System.out.println(emp.getEmployeeInfo());
    }
}
