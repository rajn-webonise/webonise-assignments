
public class init {

	public static void main(String[] args) {

		PCBuilder myPCBuilder = new PCBuilder();
		
		PC rajPC = myPCBuilder.makePC("Raj");
		PC sumitPC = myPCBuilder.makePC("Sumit Kumar");
		PC riyaPC = myPCBuilder.makePC("Riya16");
		
		System.out.println("\n\nThe price of, for example, Sumit's chassis is: " + sumitPC.cabinet.chassis.price);
	}

}
