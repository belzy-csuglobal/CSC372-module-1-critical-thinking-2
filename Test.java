import employees.*;

public class Test {
  public static void main(String[] args) {
    Manager manager = new Manager();

    manager.setEmployeeID(10005724);
    manager.setFirstName("John");
    manager.setLastName("Smith");

    manager.employeeSummary();
  }
}