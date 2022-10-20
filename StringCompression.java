public class StringCompression {
    public int compress(char[] chars) {
        int ansIndex = 0;
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            char at = chars[i];
            char next = (char) 0;
            if (i < chars.length - 1) {
                next = chars[i + 1];
            }
            if (next == at) {
                counter++;
            } else {
                chars[ansIndex++] = at;
                if (counter > 0) {
                    char[] num = Integer.toString(counter + 1).toCharArray();
                    for (char c : num) {
                        chars[ansIndex++] = c;
                    }
                }
                counter = 0;
            }
        }
        return ansIndex;
    }
}
