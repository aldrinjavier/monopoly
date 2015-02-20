package edu.ncsu.monopoly;

public class JailCell extends Cell {
	public static int BAIL = 50;
	public JailCell() {
		setName("Jail");
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
