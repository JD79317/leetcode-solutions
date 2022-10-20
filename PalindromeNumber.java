public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        for (int i = 0; i < str.length() / 2; i++) {
            char at = str.charAt(i);
            char back = str.charAt(str.length() - 1 - i);
            if (at != back) {
                return false;
            }
        }
        return true;
    }
}
