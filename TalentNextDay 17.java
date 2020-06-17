public static String largestMagical(String S) {
    // Write your code here
            if (S.length() <= 2) {
            return S;
        }
        int n = S.length();
        int stack = 0;
        List<String> partitionedStrings = new ArrayList<>();
        int preJ = 0;
        for (int j = 0; j < n; j++) {
            if (S.charAt(j) == '1') {
                stack++;
            } else {
                stack--;
                if (stack == 0) {
                    String s = largestMagical(S.substring(preJ + 1, j));
                    preJ = j + 1;
                    partitionedStrings.add('1' + s + '0');
                }
            }
        }
        Collections.sort(partitionedStrings);
        StringBuilder res = new StringBuilder();
        for (int j = partitionedStrings.size() - 1; j >= 0; j--) {
            res.append(partitionedStrings.get(j));
        }
        return res.toString();
