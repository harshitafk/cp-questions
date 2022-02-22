class BrowserHistory {

   
	LinkedList<String> history = null;
    int index = 0;
    public BrowserHistory(String homepage) {
    	this.history = new LinkedList<>();
        history.add(homepage);
        index  = history.size()-1;
    }
    
    public void visit(String url) {
        // System.out.println(index);
        
    	if(index < history.size()-1) {
    	history.subList(index+1, history.size()).clear();
        }
        history.add(url);
        index  = history.size()-1;
        
    }
    
    public String back(int steps) {
    	if(index < steps) {
            index = 0;
    		return history.get(0);
    	}else {
    		int returnIndex = index - steps;
    		index = index - steps;
    		return history.get(returnIndex);
    	}
    	
    }
    
    public String forward(int steps) {
        if(steps + index > history.size()-1) {
            index = history.size()-1;
        	return history.get(history.size()-1);
        }else {
        	int returnIndex = index + steps;
    		index = index + steps;
    		return history.get(returnIndex);
        }
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */