class Solution {
    public int balancedStringSplit(String s) {
        int n = 0, l = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                ++l;
            } else {
                --l;
            }
            if (l == 0) {
                ++n;
            }
        }
        return n;

    }
}
