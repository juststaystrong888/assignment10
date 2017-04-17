import java.util.ArrayList;

public class Farm {
	//global fields of class Farm
	private ArrayList<Field> fields;
	private ArrayList<Harvester> harvesters;
	private int profit;
	
	//Creating list of fields and harvesters in Farm constructor
	public Farm(){
		fields=new ArrayList<Field>();
		harvesters=new ArrayList<Harvester>();
	}
 
  //method add harvester to the list of harvesters
	public void addHarvester(Harvester harvester){
		harvesters.add(harvester);
	}
//method adds field to the list of fields
	public void addField(Field field){
		fields.add(field);
	}
	//method returns profit
	public int getProfit(){
		return profit;
	}
	
	/* Count total harvesting capacity of each harvester from the list of harvesters
	 * if their total is less then number of fields then harvest only that number of fields and return false
	 * else harvest all fields and return true*/
		
	public boolean harvest(){
		int total=0;
		for(Harvester harvester:harvesters){
			total+=harvester.harvestingCapacity();
		}
			if(total<fields.size()){
				for(int i=0;i<total;i++){
					profit+=fields.get(i).harvest();
						  }
				
				
				return false;
				}
			else {
				
				for(Field field:fields){
					profit+=field.harvest();
				}	return true;
			}	
			
		
		
	}


}
