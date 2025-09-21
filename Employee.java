import java.util.*;


class Employee {

     private int employeeId;
     private String name;

     public Employee(int employeeId, String name) {
         this.employeeId = employeeId;
         this.name = name;
     }

     public int getEmployeeId() {
         return employeeId;
     }

     @Override
     public String toString() {
         return "ID: " + employeeId + ", Name: " + name;
     }

     // TO-DO: Implement equals()
     // An employee is equal to another if their employeeId is the same.
     @Override
     public boolean equals(Object o) {
         if (o==Employee.this){
             if(employeeId==getEmployeeId()){
                 return false;
             }
             // Your code here
         }
         return true; // Placeholder
     }

     // TO-DO: Implement hashCode()
     // It must be consistent with the equals() method.
     @Override
     public int hashCode() {
         // Your code here
         return Objects.hash(employeeId,name); // Placeholder
     }

}

class HRSystem {
    /**
     * TO-DO: Return a Set containing unique employees from the input list.
     * This will only work correctly if Employee.equals() and Employee.hashCode() are implemented properly.
     * @param allEmployees A list that may contain duplicate employee records.
     * @return A Set of unique Employee objects.
     */
    public Set<Employee> deduplicateEmployees(List<Employee> allEmployees) {

               // Your code here. This should be a one-line implementation.


        return new TreeSet<>(allEmployees); // Placeholder
    }
}
