
public class DeskLamp {
	private boolean isOn;
	
	public void turnOn(){
		this.isOn = true;;
	}
	
	public void turnOff(){
		this.isOn = false;
	}
	
	public String toString() {
		if(isOn) 
			return "On";
		else
			return "Off";
	}
		
		
	
	
	
}
