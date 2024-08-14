package employees;

public class Manager extends Employee {
  private String department = "A";

  @Override
  public void employeeSummary() {
    System.out.printf(
      "Employee Summary\n ID: %d\n Department: %s\n Name: %s, %s\n Salary: $%.2f", 
      this.getEmployeeID(), this.department, this.getLastName(), this.getFirstName(), this.salary);
  }
}
