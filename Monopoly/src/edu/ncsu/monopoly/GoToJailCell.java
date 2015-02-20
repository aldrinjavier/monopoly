package edu.ncsu.monopoly;

public class GoToJailCell extends Cell {
	
	public GoToJailCell() {
		setName("Go to Jail");
	}

	public boolean playAction(String msg) {
		boolean strFlag = false;
    	if(msg != null){
    		strFlag = true;
    	}else{
    		strFlag = false;
    	}
    	return strFlag;
	}
}
