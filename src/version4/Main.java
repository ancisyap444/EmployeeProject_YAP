package version4;

public class Main {
    public static void main(String[] args) {
        EmployeeRoster roster = new EmployeeRoster(6);

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

        HourlyEmployee emp5 = new HourlyEmployee(102,
                new Name("David", "Allan", "White"),
                new MyDate(15, 3, 1997),
                new MyDate(10, 8, 2021),
                40.00f, 200.00);

        System.out.println("======================================================================");
        System.out.println("EMPLOYEE ROSTER INITIALIZATION & ENROLLMENT");
        System.out.println("======================================================================");

        Employee[] initialEmployees = { emp1, emp2, emp3, emp4, emp5 };
        for (Employee emp : initialEmployees) {
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
            boolean success = roster.addEmployee(emp);
            System.out.printf("Added: %s (%s) -> %s%n", emp.getEmpName(), type, success ? "Success" : "Failed");
        }

        System.out.println();
        System.out.println("--- ROSTER COMPOSITION COUNTS ---");
        System.out.printf("Total Employees: %d / %d%n", roster.getCount(), roster.getMax());
        System.out.printf("Hourly Employees: %d%n", roster.countHE());
        System.out.printf("Piece Worker Employees: %d%n", roster.countPWE());
        System.out.printf("Commission Employees (Pure): %d%n", roster.countCE());
        System.out.printf("Base Plus Commission Employees: %d%n", roster.countBPCE());

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("ROSTER PAYROLL REPORT (Target Month: Sep)");
        System.out.println("======================================================================");
        roster.displayPayroll(9);

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("TESTING EMPLOYEE REMOVAL & ARRAY COMPACTION");
        System.out.println("======================================================================");
        Employee removed = roster.removeEmployee(201);
        if (removed != null) {
            System.out.printf("Removing Employee ID %d (%s)... Successfully removed.%n",
                    removed.getEmpID(), removed.getEmpName());
        }
        System.out.printf("Current Employee Count: %d%n%n", roster.getCount());
        System.out.println("Remaining Employees in Roster:");
        roster.displayAllEmployees();
        System.out.println("======================================================================");
    }
}
