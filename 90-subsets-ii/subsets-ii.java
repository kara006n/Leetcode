class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<Integer> input  = new ArrayList<>();
        List<Integer> output  = new ArrayList<>();
        
        List<List<Integer>> listFinal = new ArrayList<>();
        
        for(int num: nums) {
        	input.add(num);
        }
        
       
        recursive(input, output, listFinal);

        for(List<Integer> x : listFinal) {
        	Collections.sort(x);
        }
        Set<List<Integer>> set = new HashSet<>(listFinal);
        
        
        listFinal.clear();
        listFinal.addAll(set);
        return listFinal;
    }
	
	public void recursive(List<Integer> input, List<Integer> output, List<List<Integer>> listFinal) {
		
		if(input.size()==0) {
			listFinal.add(output);
			return;
		}
		
		int temp = input.remove(0);
		List<Integer> output2 = new ArrayList<>(output);
		output2.add(temp);
		recursive(new ArrayList<>(input), output, listFinal);
		recursive(input, output2, listFinal);
		return;
		
	}
}