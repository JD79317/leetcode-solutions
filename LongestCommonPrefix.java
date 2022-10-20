public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        String start = strs[0];
        for (int i = 0; i < start.length(); i++) {
            boolean allSame = true;
            char lastChar = start.charAt(i);
            for (int i0 = 1; i0 < strs.length; i0++) {
                String string = strs[i0];
                if (string.length() <= i || string.charAt(i) != lastChar) {
                    allSame = false;
                    break;
                }
            }
            if (allSame) {
                builder.append(lastChar);
            } else {
                break;
            }
        }
        return builder.toString();
    }
}
