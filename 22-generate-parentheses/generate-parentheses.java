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
			System.out.println("print done");
			return;
		}
		
		if(open == close) {
			recursion(open-1, close, output+"(", list);
			return;
		}
		if(open ==0) {
			recursion(open, close-1, output+")", list);
			return;
		}
		recursion(open-1, close, output+"(", list);
		recursion(open, close-1, output+")", list);
		return;
				
	}
}