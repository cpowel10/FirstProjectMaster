package day3;

public class ContractEmployee extends Employee{
    private int contractDuration;
    private int payPerHour;

    public ContractEmployee(int contractDuration, int payPerHour) {
        this.contractDuration = contractDuration;
        this.payPerHour = payPerHour;
    }

    public ContractEmployee(int employeeId, String employeeName, int contractDuration, int payPerHour) {
        super(employeeId, employeeName);
        this.contractDuration = contractDuration;
        this.payPerHour = payPerHour;
    }
}
