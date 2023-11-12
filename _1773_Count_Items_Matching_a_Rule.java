import java.util.ArrayList;
import java.util.List;

public class _1773_Count_Items_Matching_a_Rule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        // Time spacing: O(n)
        // Determine what is ruleKey: type, color or name
        int representationForRuleValue = 0;
        if (ruleKey == "type") {
            // do something
            representationForRuleValue = 0;
        } else if (ruleKey == "color") {

            representationForRuleValue = 1;
        } else {

            representationForRuleValue = 2;
        }
        
        // Need to a variable count to amount result matched
        int count = 0;

        // Only compare value at the position same rule key
        for (int i = 0; i < items.size(); i++) {
            List<String> listTerm = items.get(i);
            String value = listTerm.get(representationForRuleValue);
            
            if (value.equals(ruleValue)) {
                count++;
            }
        }
            
        


        return count;
    }

    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        
        // First item
        List<String> item1 = new ArrayList<>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");
        items.add(item1);
        
        // Second item
        List<String> item2 = new ArrayList<>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");
        items.add(item2);
        
        // Third item
        List<String> item3 = new ArrayList<>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");
        items.add(item3);
        String ruleString = "color";
        String ruleValue = "silver";

        int result = countMatches(items, ruleString, ruleValue);

        System.out.println("Result = " + result);
    }
}
