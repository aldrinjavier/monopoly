package edu.ncsu.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
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
	
	void setName(String name) {
	}
}
