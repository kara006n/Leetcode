class Solution {
    public List<String> generateParenthesis(int n) {
		
		List<String> list = new ArrayList<>();
		
		int open = n;
		int close = n;
		String output ="";
		
		recursion(open, close, output, list);
		return list;

	}


	private void recursion(int open, int close, String output, List<String> list) {
		
		if(open == 0 && close ==0) {
			list.add(output);
			return;
		}
		
		
		if(open>0) {
			recursion(open-1, close, output+"(", list);
		}
		
		if(open<close) {
			recursion(open, close-1, output+")", list);
		}
				
	}
}