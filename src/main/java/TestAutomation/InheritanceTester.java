package TestAutomation;

public class InheritanceTester {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ondia");
        person.setAge(35);
        person.setGender("F");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        Employee employee = new Employee();
        employee.setEmployeeId("86-43324-23");
        employee.setTitle("Manager");
        System.out.println(employee.getEmployeeId());
        System.out.println(employee.getTitle());
    }
}
