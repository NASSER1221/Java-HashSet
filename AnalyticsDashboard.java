import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AnalyticsDashboard {
    /**
     * TO-DO: Find all users that are in the 'allUsers' list but NOT in the 'activeUsers' list.
     * Use HashSets for an efficient implementation.
     \*
     * @param allUsers A list of all registered Employee objects.
     * @param activeUsers A list of recently active Employee objects.
     * @return A Set of inactive Employee objects.
     */
    public Set<Employee> findInactiveUsers(List<Employee> allUsers, List<Employee> activeUsers) {
        // Your code here:
        // 1. Convert both lists to HashSets.
        // 2. Perform the set difference operation.
        // 3. Return the resulting set.

        HashSet<Employee> allTheUsers=new HashSet<>(allUsers);
        HashSet<Employee> allActive=new HashSet<>(activeUsers);

        allTheUsers.removeAll(allActive);



        return new HashSet<>(allTheUsers); // Placeholder
    }

}
