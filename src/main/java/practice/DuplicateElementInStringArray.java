package practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInStringArray {
    public static void main(String[] args) {
        String[] arr = {"java", "C", "C++", "Python", "C", "java"};

        //Without Set
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate Element: " + arr[i]);
                }
            }
        }

        //With set
        Set<String> seen = new HashSet<>();

        for (String element : arr) {
            if (!seen.add(element)) {
                System.out.println("Duplicate Element: " + element);
            }
        }


    }
}
