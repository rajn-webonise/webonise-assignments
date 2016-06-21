
public class init {

	public static void main(String[] args) {

		PCFactory myPCFactory = new PCFactory();
		
		PC rajPC = myPCFactory.makePC("Raj", "TOWER");
		PC sumitPC = myPCFactory.makePC("Sumit Kumar", "TOWER");
		PC riyaPC = myPCFactory.makePC("Riya16", "DESKTOP");
	}
	
}
