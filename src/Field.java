import java.util.ArrayList;

public class Field {
	/*global fields of class Field*/
	private ArrayList<Crop> field;
	public final static int MAXIMUM_QUANTITY=10;//constant of 10 crops per field
	
	/*Constructor Field with crop's type and value
	 * creating list field 
	 * plant crops of given type and value*/
	
	public Field(String type, int value){
		field=new ArrayList<Crop>();
		plant(type,value);
		
	}
	/*Method plants field with 10 crops of given type and value*/
	
	public void plant(String type, int value){
		for(int i=0; i<MAXIMUM_QUANTITY;i++){
			field.add(new Crop(type,value));
		}
	}
	
	
/*Method harvests crops from the field and counts them, then removes all harvested crops.
 * */
	public int harvest(){
		int total=0;
		
		for(int i=0;i<MAXIMUM_QUANTITY;i++){
			total+=field.get(i).getValue();
			
		}
		field.clear();
		
		return total;
	}
}
