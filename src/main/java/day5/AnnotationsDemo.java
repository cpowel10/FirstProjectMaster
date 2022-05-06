package day5;

import java.util.Date;

@Author(authorName="Chris Powell",purpose="To train employees",dateCreated = "5/6/2022")
class Employee{
    public void assignProject(){

    }
}
@Author(authorName="Chris Powell",purpose="To train employees",dateCreated = "5/6/2022")
class ContractEmployee extends Employee{
    @Override
    public void assignProject() {

    }

    @Deprecated
    public void fillTimesheetProject(){

    }
}
public class AnnotationsDemo {
    public static void main(String[] args) {
        Date date = new Date("12/12/2019"); //Deprecated
        System.out.println(date);

        ContractEmployee c = new ContractEmployee();
        c.fillTimesheetProject();
    }
}
