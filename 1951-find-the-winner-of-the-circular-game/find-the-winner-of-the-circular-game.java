class Solution {
    public int findTheWinner(int n, int k) {
		
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i<=n; i++) {
			list.add(i);
		}
		int curr = 0;
		recursion(list, k, curr);
		return list.get(0);

	}

	private void recursion(List<Integer> list, int k, int curr) {
		
		if(list.size()==1) {
			return;
		}
		int temp = (curr + (k-1))%list.size();
		list.remove(temp);
		recursion(list, k, temp);
		
		
	}
}