import java.util.ArrayList;

public class Harvest {

	public static void main(String[] args) {
		/*Creating farm,
		 * harvester and
		 * combine harvester*/
		Farm farm = new Farm();

		Harvester harvester = new Harvester(1,1);
		//add harvester to farm
		farm.addHarvester(harvester);
		
		CombineHarvester combineHarvester= new CombineHarvester(2,2,3);
		//add combine harvester to farm
		farm.addHarvester(combineHarvester);   
		//creating 20 fields, first 5 will be with corn, then wheat,oat and barley and value of 20.
			for(int i=0; i<5; i++){
			farm.addField(new Field("corn",20));
			}
			for(int j=0;j<5; j++){
				farm.addField(new Field("wheat",20));
			}
			for(int k=0; k<5; k++){
				farm.addField(new Field("oat",20));
				
			}

			for(int n=0;n<5;n++){
				farm.addField(new Field("barley",20));		
			}
			//harvest fields in farm
			farm.harvest();
			System.out.println("Farm's profit £"+farm.getProfit());//print Farm's profit 2800


	}

}
