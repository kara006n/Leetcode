class Solution {

    public List<String> letterCasePermutation(String s) {

        List<String> list = new ArrayList<>();
        String output = "";
        recursion(s, output, 0, list);
        return list;

    }

    private void recursion(String input, String output, int n, List<String> list) {

        if (n == input.length()) {
            list.add(output);
            return;
        }

        char charAt = input.charAt(n);

        if (Character.isLetter(charAt)) {
            recursion(input, output+ Character.toLowerCase(charAt), n+1, list);
            recursion(input, output+ Character.toUpperCase(charAt), n+1, list);

        } else {
            recursion(input, output+ charAt, n+1, list);
        }
    }
}