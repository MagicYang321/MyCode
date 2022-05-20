package gitTest;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        String s = strs[0];
        int[] records = new int[strs.length];
        records[0] = s.length();
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            String curStr = strs[i];
            while (j < curStr.length() && j < s.length()){
                if (curStr.charAt(j) == s.charAt(j)){
                    j += 1;
                }else {
                    break;
                }
            }
            records[i] = j;
        }

        int minLength = records[0];
        for (int i = 1; i < records.length; i++) {
            if (records[i] < minLength){
                minLength = records[i];
            }
        }

        if (minLength == 0 ){
            return "";
        }
        return s.substring(0,minLength);

    }
}