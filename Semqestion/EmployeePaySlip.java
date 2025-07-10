package Semqestion;

class Employee {
    String empName, empId, address, mailId;
    long mobileNo;

    public Employee(String empName, String empId, String address, String mailId, long mobileNo) {
        this.empName = empName;
        this.empId = empId;
        this.address = address;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
    }

    void displayEmployeeDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empId);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + mailId);
        System.out.println("Mobile No: " + mobileNo);
    }
}

class Programmer extends Employee {
    double basicPay;

    public Programmer(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo);
        this.basicPay = basicPay;
    }

    void generatePaySlip() {
        calculateAndDisplaySalary();
    }

    void calculateAndDisplaySalary() {
        double da = 0.97 * basicPay;
        double hra = 0.10 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double netSalary = grossSalary - (pf + staffClubFund);

        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff Club Fund: " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + netSalary);
    }
}

class AssistantProfessor extends Programmer {
    public AssistantProfessor(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class AssociateProfessor extends Programmer {
    public AssociateProfessor(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

class Professor extends Programmer {
    public Professor(String empName, String empId, String address, String mailId, long mobileNo, double basicPay) {
        super(empName, empId, address, mailId, mobileNo, basicPay);
    }
}

public class EmployeePaySlip {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Alice", "P001", "Tenkasi", "alice@mail.com", 9876543210L, 50000);
        AssistantProfessor assistantProfessor = new AssistantProfessor("Bob", "A001", "Tenkasi", "bob@mail.com", 9876543211L, 60000);
        AssociateProfessor associateProfessor = new AssociateProfessor("Charlie", "AP001", "Tenkasi", "charlie@mail.com", 9876543212L, 70000);
        Professor professor = new Professor("David", "PR001", "Tenkasi", "david@mail.com", 9876543213L, 80000);

        System.out.println("Programmer:");
        programmer.displayEmployeeDetails();
        programmer.generatePaySlip();
        System.out.println("\nAssistant Professor:");
        assistantProfessor.displayEmployeeDetails();
        assistantProfessor.generatePaySlip();
        System.out.println("\nAssociate Professor:");
        associateProfessor.displayEmployeeDetails();
        associateProfessor.generatePaySlip();
        System.out.println("\nProfessor:");
        professor.displayEmployeeDetails();
        professor.generatePaySlip();
    }
}
