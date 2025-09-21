import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class SkillAnalyzer {
    /**
     * TO-DO: Find skills present in one set but not both.
     * For example, if candidateA has {Java, Python} and candidateB has {Python, SQL},
     * the result should be {Java, SQL}.
     \*
     * @param candidateASkills The skills of the first candidate.
     * @param candidateBSkills The skills of the second candidate.
     * @return A new HashSet containing only the unique skills for each candidate.
     */
    public Set<String> findUniqueSkills(Set<String> candidateASkills, Set<String> candidateBSkills) {
        // Hint: You might need to find the interS and intersection first.
        // Your code here


        HashSet<String> interS = new HashSet<>();

        for (String s : candidateASkills) {
            if (!candidateBSkills.contains(s)) {
                interS.add(s);
            }
        }

        for (String s : candidateBSkills) {
            if (!candidateASkills.contains(s)) {
                interS.add(s);
            }

        }
        return interS;


    }

    public static void main(String[] args) {
        SkillAnalyzer skill = new SkillAnalyzer();

        Set<String> aSector  = new HashSet<>(Arrays.asList("SQL","Python"));
        Set<String> bSector = new HashSet<>(Arrays.asList("Java","Python"));
        Set<String> wSector = new HashSet<>(Arrays.asList("C++","Java"));

        System.out.println("Result 1 : " + skill.findUniqueSkills(aSector,bSector) );
        System.out.println("Result 2 : " + skill.findUniqueSkills(wSector,bSector));


    }
}