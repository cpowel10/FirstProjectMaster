package day2;

public class Employee {
    int employeeID;
    String employeeName;

    public Employee(){
        employeeID=-1;
        employeeName="NA";
    }

    public Employee(int id, String name){
        employeeID=id;
        employeeName=name;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(630,"Trevor");
        Employee emp3 = new Employee(450,"AJ");
        Employee emp4 = new Employee(619,"Rey");

        System.out.println(emp1.employeeID + " " + emp1.employeeName);
        System.out.println(emp2.employeeID + " " + emp2.employeeName);
        System.out.println(emp3.employeeID + " " + emp3.employeeName);
        System.out.println(emp4.employeeID + " " + emp4.employeeName);
    }
}
