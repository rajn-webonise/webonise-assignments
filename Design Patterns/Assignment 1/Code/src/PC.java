
public class PC{

	String name;
	Cabinet cabinet;
	
	PC(String name){
		this.name = name;
		this.cabinet = new Cabinet(1000, 0);
	}

}
