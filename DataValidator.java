
import java.util.HashSet;
import java.util.Set;


public class DataValidator {


    /**
     * TO-DO: Efficiently check for duplicates in an array using a HashSet.
     * The method should stop and return true as soon as the first duplicate is found.
     \*
     * @param items The array of strings to check.
     * @return true if duplicates exist, false otherwise.
     */
    public boolean hasDuplicates(String[] items) {
        Set<String> seenItems = new HashSet<>();
       for (String s : items){

        if (!seenItems.add(s)){
            return true;// Your code here. Use the return value of set.add() to detect a duplicate.
        }
       }
        return false; // Placeholder
    }
}
