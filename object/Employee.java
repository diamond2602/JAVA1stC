package object;

public class Employee {
    /*
    create Employee_Class:
    `method: to update company budget
    `instance fields: --> id, name, budgetOfCompany, companyName
    `constructors: --> no args, one arg, multiple
    */
    String name;
    String companyname;
    int id;
    double budgetOfCompany;

    public void updateCompanyBudget(double expenses){
        budgetOfCompany-=expenses;
        System.out.println("The budget of the company is now:"+ budgetOfCompany);
    }

    public Employee(){

    }
    public Employee(int id){

    }
    public Employee(String name, int id){

    }
    public  Employee(String name, String companyName){

    }

    public Employee(double budgetOfCompany) {
        this.budgetOfCompany = budgetOfCompany;
    }

    public void setBudgetOfCompany(double budgetOfCompany) {
        this.budgetOfCompany = budgetOfCompany;
    }

    public double getBudgetOfCompany() {
        return budgetOfCompany;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("Zack",34);
        e1.updateCompanyBudget(5000);
        e1.budgetOfCompany=200000;
        System.out.println(e1.getBudgetOfCompany());

        Employee e2=new Employee(45);

        // if you want to create an object with no argument?? if there is
        // no 'no argument constructor in the class
        // you can not create an object by using default java constructor. because it will be gone after
        // you create your own  constructor.
        Employee e3=new Employee("Jack", "Techtorial");

    }
}
