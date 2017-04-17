
public class Harvester {
	/*private fields of class Harvester*/
	private int fuelTankSize;
	private int topSpeed;
	
	//Constructor Harvester. Each harvester has certain fuel tank size and top speed
	public Harvester(int fuelTankSize, int topSpeed){
		this.fuelTankSize=fuelTankSize;
		this.topSpeed=topSpeed;
	}
	public int harvestingCapacity(){//method returns sum of fuel tank size and top speed
		return fuelTankSize+topSpeed;
	}
	
	


}
