package version5;

public class Main {
    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster();

        HourlyEmployee emp1 = new HourlyEmployee(101,
                new Name("Alice", "Marie", "Smith"),
                new MyDate(18, 9, 2000),
                new MyDate(1, 6, 2022),
                45.00f, 200.00);

        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(201,
                new Name("Bob", "Clark", "Jones", "Jr."),
                new MyDate(5, 4, 1998),
                new MyDate(15, 1, 2023),
                90, 45.00);

        CommissionEmployee emp3 = new CommissionEmployee(301,
                new Name("Maria", "Louisa", "Reyes"),
                new MyDate(10, 9, 1995),
                new MyDate(12, 7, 2021),
                100000.00);

        BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(401,
                new Name("Kevin", "Santos", "Tan"),
                new MyDate(22, 11, 1994),
                new MyDate(5, 4, 2018),
                80000.00, 24000.00);

        System.out.println("======================================================================");
        System.out.println("DYNAMIC ROSTER INITIALIZATION (ArrayList Backend)");
        System.out.println("======================================================================");

        Employee[] employees = { emp1, emp2, emp3, emp4 };
        for (Employee emp : employees) {
            String type = "";
            if (emp instanceof HourlyEmployee) {
                type = "Hourly";
            } else if (emp instanceof PieceWorkerEmployee) {
                type = "Piece Worker";
            } else if (emp instanceof BasePlusCommissionEmployee) {
                type = "Base Plus Commission";
            } else if (emp instanceof CommissionEmployee) {
                type = "Commission";
            }
            roster.addEmployee(emp);
            System.out.printf("Enrolled: %s (%s)%n", emp.getEmpName(), type);
        }
        System.out.printf("Total Roster Size: %d employees%n", roster.countEmployees());

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("PURE POLYMORPHIC PAYROLL REPORT (Target Month: Sep)");
        System.out.println("[No downcasting; dynamic dispatch via Employee.computeSalary()]");
        System.out.println("======================================================================");
        roster.displayPayroll(9);

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("COLLECTION REMOVAL TEST");
        System.out.println("======================================================================");
        Employee removed = roster.removeEmployee(201);
        if (removed != null) {
            System.out.printf("Removing Employee ID %d... Successfully removed.%n", removed.getEmpID());
        }
        System.out.printf("Updated Roster Size: %d%n%n", roster.countEmployees());
        System.out.println("Current Active Employees:");
        roster.displayAllEmployees();
        System.out.println("======================================================================");
    }
}