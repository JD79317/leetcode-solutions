public class LongestSubstringNoRepeatingChars {
    public int lengthOfLongestSubstring(String s) {
        int longestSoFar = 0;
        for (int i = 0; i < s.length(); i++) {
            List<Integer> knownChars = new ArrayList<>();
            int length = 0;
            for (int i2 = i; i2 < s.length(); i2++) {
                int charID = s.charAt(i2);
                if (!knownChars.contains(charID)) {
                    knownChars.add(charID);
                    length++;
                    if (length > longestSoFar) {
                        longestSoFar = length;
                    }
                } else {
                    if (length > longestSoFar) {
                        longestSoFar = length;
                    }
                    break;
                }
            }
        }
        return longestSoFar;
    }
}
