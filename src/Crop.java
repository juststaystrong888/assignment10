
public class Crop {
	//global fields of class Crop
	private String type;
	private int value;
	//each Crop has it's type and value
	public Crop(String type, int value){
		this.type=type;
		this.value=value;
	}
	//method returns value of crop
	public int getValue(){
		return value;
	}

}
