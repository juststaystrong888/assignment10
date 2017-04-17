//CombineHarvester is a subclass of Harvester
public class CombineHarvester extends Harvester{
//global field of class CombineHarvester
	private int length;
	
	//Constructor CombineHarvester. each combine harvester has the same arguments as harvester and length of cutter bar
	public CombineHarvester(int fuelTankSize, int topSpeed,int length) {
		super(fuelTankSize, topSpeed);
		this.length= length;
	}
	//override method harvestingCapacity of super class by returning value from harvestingCapacity of superclass times length
	public int harvestingCapacity(){
		return super.harvestingCapacity()*length;
	}
}

