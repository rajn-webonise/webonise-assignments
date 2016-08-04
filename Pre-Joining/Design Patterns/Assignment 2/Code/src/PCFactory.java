
public class PCFactory {

	public PC makePC(String name, String type){
		
		if(type.equalsIgnoreCase("TOWER")){
			return new PCTower(name);
		}
		else if(type.equalsIgnoreCase("DESKTOP")){
			return new PCDesktop(name);
		}
		
		return null;
		
	}

}
