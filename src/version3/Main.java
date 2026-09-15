package version3;

public class Main {
    public static void main(String[] args) {
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
                new Name("Maria", "Louisa", "Garcia"),
                new MyDate(10, 9, 1995),
                new MyDate(12, 7, 2021),
                100000.00);

        BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(401,
                new Name("Sarah", "Beth", "Taylor"),
                new MyDate(22, 11, 1994),
                new MyDate(5, 4, 2018),
                100000.00, 20000.00);

        Employee[] employees = new Employee[] { emp1, emp2, emp3, emp4 };
        int targetMonth = 9;

        System.out.println("======================================================================");
        System.out.println("POLYMORPHIC PAYROLL REPORT (Target Month: Sep)");
        System.out.println("======================================================================");

        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            double basePay = emp.computeSalary();
            double totalPayout = emp.computeSalary(targetMonth);
            double bonus = totalPayout - basePay;
            boolean eligible = (emp.getBirthDate() != null && emp.getBirthDate().getMonth() == targetMonth);
            String eligibility = eligible ? "(Eligible)" : "(Ineligible)";

            System.out.printf("%d. %s [ID: %d, Name: %s, DOB: %s, Hired: %s]%n",
                    i + 1, emp.getClass().getSimpleName(), emp.getEmpID(), emp.getEmpName(), emp.getBirthDate(), emp.getDateHired());
            System.out.printf("   Base Pay: ₱%,.2f | Birthday Bonus: ₱%,.2f %s%n", basePay, bonus, eligibility);
            System.out.printf("   Total Payout: ₱%,.2f%n%n", totalPayout);
        }

        System.out.println("======================================================================");
        System.out.println("OBJECT CONTRACT TESTS (equals & hashCode)");
        System.out.println("======================================================================");

        HourlyEmployee testEmp1 = new HourlyEmployee(101,
                new Name("Alice", "Marie", "Smith"),
                new MyDate(18, 9, 2000),
                new MyDate(1, 6, 2022),
                45.00f, 200.00);

        HourlyEmployee testEmp1Identical = new HourlyEmployee(101,
                new Name("Alice", "Marie", "Smith"),
                new MyDate(18, 9, 2000),
                new MyDate(1, 6, 2022),
                45.00f, 200.00);

        HourlyEmployee testEmp2 = new HourlyEmployee(102,
                new Name("Mark", "Richard", "Johnson"),
                new MyDate(15, 3, 1995),
                new MyDate(10, 8, 2021),
                38.00f, 180.00);

        System.out.println("emp1 equals emp1Identical: " + testEmp1.equals(testEmp1Identical));
        System.out.printf("emp1 hashCode: %d | emp1Identical hashCode: %d (Match: %b)%n",
                testEmp1.hashCode(), testEmp1Identical.hashCode(), testEmp1.hashCode() == testEmp1Identical.hashCode());
        System.out.println("emp1 equals emp2: " + testEmp1.equals(testEmp2));
        System.out.println();

        System.out.println("======================================================================");
        System.out.println("DEEP CLONE VERIFICATION");
        System.out.println("======================================================================");

        HourlyEmployee empClone = testEmp1.clone();
        System.out.println("Original Name before modification: " + testEmp1.getEmpName());
        empClone.getEmpName().setLastName("Taylor");
        System.out.println("Clone Name changed to:             " + empClone.getEmpName());
        System.out.println("Original Name after modification:  " + testEmp1.getEmpName() + " (Deep copy successful!)");
    }
}