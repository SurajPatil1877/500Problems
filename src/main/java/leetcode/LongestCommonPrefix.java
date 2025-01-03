package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
//        Write a function to find the longest common prefix string amongst an array of strings.
//                If there is no common prefix, return an empty string "".
//                Example 1:
//        Input: strs = ["flower","flow","flight"]
//        Output: "fl"
//        Example 2:
//
//        Input: strs = ["dog","racecar","car"]
//        Output: ""


        //String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"dog","racecar","car"};

        String keyword;

        List<String> commonList = new ArrayList<>();

        for (int i = 2; i <= strs[0].length(); i++) {
            int count = 0;
            keyword = strs[0].substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].contains(keyword)) {
                    count++;
                }
            }
            if (count == strs.length - 1) {
                commonList.add(keyword);
            }
        }

        String longestStr = "";
        for (String str : commonList) {
            if (str.length() > longestStr.length()) {
                longestStr = str;
            }
        }

        System.out.println(longestStr);


    }
}
