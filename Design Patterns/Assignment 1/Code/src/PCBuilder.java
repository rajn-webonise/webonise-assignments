
public class PCBuilder {
	
	PC makePC(String name){
		PC newPC = new PC(name);
		System.out.println(name + "'s PC was created!");
		return newPC;
	}

}
