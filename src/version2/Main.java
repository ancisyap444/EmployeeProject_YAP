package version2;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Name & Date Output Verification ---");
        Name sampleName = new Name("Alice", "Marie", "Smith");
        MyDate sampleDate = new MyDate(18, 9, 2026);

        System.out.print("Name: ");
        sampleName.displayName();

        System.out.print("Date: ");
        sampleDate.displayDate();
        System.out.println();

        System.out.println("--- Hourly Employee Payroll Test ---");
        Name hName1 = new Name("Alice", "Marie", "Smith");
        MyDate hDob1 = new MyDate(18, 9, 2000);
        MyDate hHired1 = new MyDate(1, 6, 2022);
        HourlyEmployee he1 = new HourlyEmployee(101, hName1, hDob1, hHired1, 45.00, 200.00);

        System.out.println("[displayHourlyEmployee()]");
        he1.displayHourlyEmployee();
        System.out.println();

        System.out.println("[toString()]");
        System.out.println(he1);
        System.out.println();

        System.out.println("[Birthday Incentive Check]");
        System.out.printf("Regular Month (Oct) Salary: ₱%,.2f%n", he1.computeSalary(10));
        System.out.printf("Birth Month (Sep) Salary (+₱5,000.00): ₱%,.2f%n", he1.computeSalary(9));
        System.out.println();

        HourlyEmployee he2 = new HourlyEmployee();
        he2.setEmpID(102);
        he2.setEmpName(new Name("Mark", "Richard", "Johnson"));
        he2.setBirthDate(new MyDate(15, 3, 1995));
        he2.setDateHired(new MyDate(10, 8, 2021));
        he2.setTotalHoursWorked(38.00);
        he2.setRatePerHour(180.00);

        System.out.println("[Hourly Employee 2 (Setter Initialization)]");
        he2.displayHourlyEmployee();
        System.out.println(he2);
        System.out.printf("Regular Month (Jan) Salary: ₱%,.2f%n", he2.computeSalary(1));
        System.out.printf("Birth Month (Mar) Salary (+₱5,000.00): ₱%,.2f%n", he2.computeSalary(3));
        System.out.println();

        System.out.println("--- Piece Worker Employee Payroll Test ---");
        Name pName1 = new Name("Bob", "Clark", "Jones", "Jr.");
        MyDate pDob1 = new MyDate(12, 5, 1998);
        MyDate pHired1 = new MyDate(15, 3, 2021);
        PieceWorkerEmployee pwe1 = new PieceWorkerEmployee(201, pName1, pDob1, pHired1, 250, 50.00);

        System.out.println("[displayPieceWorkerEmployee()]");
        pwe1.displayPieceWorkerEmployee();
        System.out.println();

        System.out.println("[toString()]");
        System.out.println(pwe1);
        System.out.println();

        System.out.println("[Birthday Incentive Check]");
        System.out.printf("Regular Month (Oct) Salary: ₱%,.2f%n", pwe1.computeSalary(10));
        System.out.printf("Birth Month (May) Salary (+₱5,000.00): ₱%,.2f%n", pwe1.computeSalary(5));
        System.out.println();

        PieceWorkerEmployee pwe2 = new PieceWorkerEmployee();
        pwe2.setEmpID(202);
        pwe2.setEmpName(new Name("Clara", "Elizabeth", "Davis"));
        pwe2.setBirthDate(new MyDate(25, 12, 1999));
        pwe2.setDateHired(new MyDate(1, 2, 2023));
        pwe2.setTotalPiecesFinished(95);
        pwe2.setRatePerPiece(60.00);

        System.out.println("[Piece Worker Employee 2 (Setter Initialization)]");
        pwe2.displayPieceWorkerEmployee();
        System.out.println(pwe2);
        System.out.printf("Regular Month (Jan) Salary: ₱%,.2f%n", pwe2.computeSalary(1));
        System.out.printf("Birth Month (Dec) Salary (+₱5,000.00): ₱%,.2f%n", pwe2.computeSalary(12));
        System.out.println();

        System.out.println("--- Commission Employee Payroll Test ---");
        Name cName1 = new Name("Maria", "Louisa", "Garcia");
        MyDate cDob1 = new MyDate(5, 8, 1995);
        MyDate cHired1 = new MyDate(10, 1, 2020);
        CommissionEmployee ce1 = new CommissionEmployee(301, cName1, cDob1, cHired1, 150000.00);

        System.out.println("[displayCommissionEmployee()]");
        ce1.displayCommissionEmployee();
        System.out.println();

        System.out.println("[toString()]");
        System.out.println(ce1);
        System.out.println();

        System.out.println("[Birthday Incentive Check]");
        System.out.printf("Regular Month (Oct) Salary: ₱%,.2f%n", ce1.computeSalary(10));
        System.out.printf("Birth Month (Aug) Salary (+₱5,000.00): ₱%,.2f%n", ce1.computeSalary(8));
        System.out.println();

        CommissionEmployee ce2 = new CommissionEmployee();
        ce2.setEmpID(302);
        ce2.setEmpName(new Name("David", "Kevin", "White"));
        ce2.setBirthDate(new MyDate(14, 2, 1992));
        ce2.setDateHired(new MyDate(12, 7, 2019));
        ce2.setTotalSales(600000.00);

        System.out.println("[Commission Employee 2 (Setter Initialization)]");
        ce2.displayCommissionEmployee();
        System.out.println(ce2);
        System.out.printf("Regular Month (Mar) Salary: ₱%,.2f%n", ce2.computeSalary(3));
        System.out.printf("Birth Month (Feb) Salary (+₱5,000.00): ₱%,.2f%n", ce2.computeSalary(2));
        System.out.println();

        System.out.println("--- Base Plus Commission Employee Payroll Test ---");
        Name bName1 = new Name("Sarah", "Beth", "Taylor");
        MyDate bDob1 = new MyDate(22, 11, 1994);
        MyDate bHired1 = new MyDate(5, 4, 2018);
        BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(401, bName1, bDob1, bHired1, 200000.00, 25000.00);

        System.out.println("[displayBasePlusCommissionEmployee()]");
        bpce1.displayBasePlusCommissionEmployee();
        System.out.println();

        System.out.println("[toString()]");
        System.out.println(bpce1);
        System.out.println();

        System.out.println("[Birthday Incentive Check]");
        System.out.printf("Regular Month (Jan) Salary: ₱%,.2f%n", bpce1.computeSalary(1));
        System.out.printf("Birth Month (Nov) Salary (+₱5,000.00): ₱%,.2f%n", bpce1.computeSalary(11));
        System.out.println();

        BasePlusCommissionEmployee bpce2 = new BasePlusCommissionEmployee();
        bpce2.setEmpID(402);
        bpce2.setEmpName(new Name("James", "Thomas", "Miller", "III"));
        bpce2.setBirthDate(new MyDate(30, 7, 1990));
        bpce2.setDateHired(new MyDate(19, 9, 2017));
        bpce2.setTotalSales(80000.00);
        bpce2.setBaseSalary(20000.00);

        System.out.println("[Base Plus Commission Employee 2 (Setter Initialization)]");
        bpce2.displayBasePlusCommissionEmployee();
        System.out.println(bpce2);
        System.out.printf("Regular Month (Aug) Salary: ₱%,.2f%n", bpce2.computeSalary(8));
        System.out.printf("Birth Month (Jul) Salary (+₱5,000.00): ₱%,.2f%n", bpce2.computeSalary(7));
    }
}