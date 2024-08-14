package employees;

public class Employee {
  private String firstName = "";
  private String lastName = "";
  private int employeeID = 0;
  protected double salary;

  public Employee() {
    this.salary = 0.0;
  }

  public void employeeSummary() {
    System.out.printf(
      "Employee Summary\n ID: %d\n Name: %s, %s\n Salary: $%.2f", 
      this.getEmployeeID(), this.getLastName(), this.getFirstName(), this.salary);
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return this.firstName;
  }
 
  public void setLastName(String lastName) {
    this.lastName = lastName;
  };

  public String getLastName() {
    return this.lastName;
  }

  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }

  public int getEmployeeID() {
    return this.employeeID;
  }
}
