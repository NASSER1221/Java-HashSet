import java.util.HashSet;
import java.util.Set;

public class ProductTagger {

    /**
     * TO-DO: Check if 'setA' is a subset of 'setB'.
     * For example, if setA is {"electronics", "sale"} and setB is {"electronics", "sale", "new"},
     * then the method should return true.
     \*
     * @param setA The potential subset.
     * @param setB The potential superset.
     * @return true if all elements of setA are in setB, false otherwise.
     */
    public boolean isSubset(Set<String> setA, Set<String> setB) {
       for (String s:setB){

           if (setB.contains(s)) return true;// Your code here. Find the correct method in the Set interface.
       }
        return false; // Placeholder
    }


}
