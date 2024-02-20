class ListNode {
	
	int val;
    int key;
	ListNode next;
	ListNode prev;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int key, int val, ListNode prev, ListNode next) { this.key = key; this.val = val; this.next = next; this.prev = prev;}
	
}

class LRUCache {
	
	private  HashMap<Integer, ListNode> map;
	private  int capacity;
	ListNode node = null;
	ListNode head = null;
	ListNode tail = null;
	

    public LRUCache(int capacity) {
    	this.map = new HashMap<>();
    	this.capacity = capacity; 
    }
    
    public int get(int key) {
    	
    	ListNode loc = map.getOrDefault(key, null);
    	
    	if(loc!=null) {   		
   			swapNode(loc);
    		return loc.val;
    	}
    	else {
    		return -1;
    	}
        
    }
    
    public ListNode put(int key, int value) {
    	
    	ListNode loc = map.getOrDefault(key, null);
    	
    	if(loc!=null) {
    		loc.val = value;
    		swapNode(loc); 
    	}
    	else {
    		
    		
    		if(map.size()<capacity) {
    			
    			
    			//just add new node and decrement the capacity
        		node = new ListNode(key, value, null, head);
        		
        		if(map.size() == 0) {
        			tail = node;
        			head =  node;
        		}
        		else {
        			head = node;
        			head.next.prev = head;
        		}
        		
        		//cap++;
        		
        		map.put(key, node);
        		
        	}
    		else {
    			//perform evict operation
//    			for(int x: map.keySet()) {
//    				System.out.println("key is "+x );
//    			}
//    			System.out.println("checking before removing "+tail.val);
    			
    			if(map.size()==1) {
    				map.remove(tail.key);
    				node = new ListNode(key, value, null, null);
    				head = node;
    				tail = node;
    				map.put(key, node);
    				
    				
    			}else {
    				map.remove(tail.key);
    				tail = tail.prev;
        			//System.out.println(tail);
        			tail.next = null;
        			node = new ListNode(key, value, null, head);
            		head.prev = node;
            		head =  node;	
            		map.put(key, node);
    			}
    			
    		}		
    	}
    	return head;
    }
    
   
    
    public void swapNode(ListNode node) {
    	
    	if(node == head) return;
    	
    	if(node == tail) {
    		tail = tail.prev;
    	}
    	
    	if(node.prev!=null) {
    		node.prev.next = node.next;
    	}
    	if(node.next!=null) {
    		node.next.prev = node.prev;
    	}
    	
    	
    	node.prev = null;
    	node.next = head;
    	head.prev = node;
    	head = node;   	
    	
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */