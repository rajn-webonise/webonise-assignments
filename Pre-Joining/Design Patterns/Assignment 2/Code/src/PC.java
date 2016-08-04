
abstract class PC {
	
	String name;
	String type;
	Cabinet cabinet;
	Chassis chassis;
	
	PC(String name, String type){
		this.name = name;
		this.type = type;
		System.out.println(name + "'s PC was created of type " + type);
	}
}
