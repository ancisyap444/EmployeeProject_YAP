package version2;

public class PieceWorkerEmployee {
    private int empID;
    private Name empName;
    private MyDate birthDate;
    private MyDate dateHired;
    private int totalPiecesFinished;
    private double ratePerPiece;

    public PieceWorkerEmployee() {
        this(0, new Name(), new MyDate(), new MyDate(), 0, 0.0);
    }

    public PieceWorkerEmployee(int empID, Name empName) {
        this(empID, empName, new MyDate(), new MyDate(), 0, 0.0);
    }

    public PieceWorkerEmployee(int empID, Name empName, MyDate birthDate, MyDate dateHired, int totalPiecesFinished, double ratePerPiece) {
        setEmpID(empID);
        setEmpName(empName);
        setBirthDate(birthDate);
        setDateHired(dateHired);
        setTotalPiecesFinished(totalPiecesFinished);
        setRatePerPiece(ratePerPiece);
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        if (empID > 0) {
            this.empID = empID;
        }
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = (empName != null) ? empName : new Name();
    }

    public MyDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(MyDate birthDate) {
        this.birthDate = (birthDate != null) ? birthDate : new MyDate();
    }

    public MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(MyDate dateHired) {
        this.dateHired = (dateHired != null) ? dateHired : new MyDate();
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        if (totalPiecesFinished >= 0) {
            this.totalPiecesFinished = totalPiecesFinished;
        }
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        if (ratePerPiece >= 0.0) {
            this.ratePerPiece = ratePerPiece;
        }
    }

    public double computeSalary() {
        int bonusCount = totalPiecesFinished / 100;
        double basePay = totalPiecesFinished * ratePerPiece;
        double bonusPay = bonusCount * (10 * ratePerPiece);
        return basePay + bonusPay;
    }

    public double computeSalary(int currentMonth) {
        double salary = computeSalary();
        if (birthDate != null && birthDate.getMonth() == currentMonth) {
            salary += 5000.00;
        }
        return salary;
    }

    public void displayPieceWorkerEmployee() {
        System.out.printf("ID: %d | Name: %s | DOB: %s | Hired: %s | Pieces: %d | Rate: ₱%,.2f/piece%n",
                empID, empName, birthDate, dateHired, totalPiecesFinished, ratePerPiece);
    }

    @Override
    public String toString() {
        return String.format("PieceWorkerEmployee [ID: %d, Name: %s, DOB: %s, Hired: %s, Pieces: %d, Rate: ₱%,.2f, Total Salary: ₱%,.2f]",
                empID, empName, birthDate, dateHired, totalPiecesFinished, ratePerPiece, computeSalary());
    }
}