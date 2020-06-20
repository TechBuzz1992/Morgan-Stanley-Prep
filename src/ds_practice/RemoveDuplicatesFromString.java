package ds_practice;

import java.util.*;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "sdhvsdjvsdjvbsdafasgsavhs";
        System.out.println(str.length());
        StringBuilder ans = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                continue;
            } else {
                ans.append(c);
                set.add(c);
            }
        }

        System.out.println(ans.toString());

    }

}