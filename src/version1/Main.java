package version1;

public class Main {
    public static void main(String[] args) {
        HourlyEmployee hourlyEmp1 = new HourlyEmployee(101, "Alice Smith");
        hourlyEmp1.setTotalHoursWorked(45.00f);
        hourlyEmp1.setRatePerHour(200.00);

        HourlyEmployee hourlyEmp2 = new HourlyEmployee(102, "John Doe", 38.00f, 250.00);

        System.out.println("--- Hourly Employee Test ---");
        System.out.println("[displayHourlyEmployee()]");
        hourlyEmp1.displayHourlyEmployee();
        hourlyEmp2.displayHourlyEmployee();

        System.out.println("\n[toString()]");
        System.out.println(hourlyEmp1);
        System.out.println(hourlyEmp2);


        PieceWorkerEmployee pieceEmp1 = new PieceWorkerEmployee();
        pieceEmp1.setEmpID(201);
        pieceEmp1.setEmpName("Bob Jones");
        pieceEmp1.setTotalPiecesFinished(250);
        pieceEmp1.setRatePerPiece(15.00);

        PieceWorkerEmployee pieceEmp2 = new PieceWorkerEmployee(202, "Emma Watson", 420, 20.00);

        System.out.println("\n--- Piece Worker Employee Test ---");
        System.out.println("[displayPieceWorkerEmployee()]");
        pieceEmp1.displayPieceWorkerEmployee();
        pieceEmp2.displayPieceWorkerEmployee();

        System.out.println("\n[toString()]");
        System.out.println(pieceEmp1);
        System.out.println(pieceEmp2);


        CommissionEmployee commEmp1 = new CommissionEmployee(301, "Charlie Brown");
        commEmp1.setTotalSale(75000.00);

        CommissionEmployee commEmp2 = new CommissionEmployee(302, "David Miller", 550000.00);

        System.out.println("\n--- Commission Employee Test ---");
        System.out.println("[displayCommissionEmployee()]");
        commEmp1.displayCommissionEmployee();
        commEmp2.displayCommissionEmployee();

        System.out.println("\n[toString()]");
        System.out.println(commEmp1);
        System.out.println(commEmp2);


        BasePlusCommissionEmployee baseCommEmp1 = new BasePlusCommissionEmployee();
        baseCommEmp1.setEmpID(401);
        baseCommEmp1.setEmpName("Diana Prince");
        baseCommEmp1.setTotalSale(60000.00);
        baseCommEmp1.setBaseSalary(10000.00);

        BasePlusCommissionEmployee baseCommEmp2 = new BasePlusCommissionEmployee(402, "Bruce Wayne", 600000.00, 25000.00);

        System.out.println("\n--- Base Plus Commission Employee Test ---");
        System.out.println("[displayBasePlusCommissionEmployee()]");
        baseCommEmp1.displayBasePlusCommissionEmployee();
        baseCommEmp2.displayBasePlusCommissionEmployee();

        System.out.println("\n[toString()]");
        System.out.println(baseCommEmp1);
        System.out.println(baseCommEmp2);
    }
}