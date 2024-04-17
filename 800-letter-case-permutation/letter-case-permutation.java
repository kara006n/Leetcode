class Solution {

	public List<String> letterCasePermutation(String s) {

        List<String> list = new ArrayList<>();
		String output = "";
		recursion(s, output, 0, list);
		return list;

	}

	private void recursion(String input, String output, int n, List<String> list) {
		
		if(n==input.length()) {
			list.add(output);
			return;
		}
		
		String temp  = ""+input.charAt(n);
		if(!temp.matches("[a-zA-Z]")) {
			output = output + temp;
			recursion(input, output, ++n, list);
			return;
		}
		
		String output2 = output;
		output = output + temp.toLowerCase();
		output2 = output2 + temp.toUpperCase();
		n++;
		recursion(input, output, n, list);
		recursion(input, output2, n, list);
		return;

	}
}