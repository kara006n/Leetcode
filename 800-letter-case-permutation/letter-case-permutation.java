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

            String output2 = output;
            output = output + Character.toLowerCase(charAt);
            output2 = output2 + Character.toUpperCase(charAt);
            n++;
            recursion(input, output, n, list);
            recursion(input, output2, n, list);
            return;

        } else {
            output = output + charAt;
            recursion(input, output, ++n, list);
            return;
        }
    }
}