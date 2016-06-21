import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class init {
	
	static List<PC> PClist = new ArrayList<PC>();

	public static void main(String[] args) {

		seedData();
		
		PClist = SortPC.sort(PClist, "price");
		displaylist();
		
		PClist = SortPC.sort(PClist, "performance");
		displaylist();
		
		PClist = SortPC.sort(PClist, "disk");
		displaylist();
		
		PClist = SortPC.sort(PClist, "serial");
		displaylist();
		
		
	}
	
	static void seedData(){
		System.out.println("\nFields are arranged in the order: PRICE | PERFORMANCE | (DISK#1_SPACE, DISK#2_SPACE) | SERIAL_ID\n");
		PClist.add(new PC(510, 0.10, (new Disk(20, 50)), "897FJE"));
		PClist.add(new PC(600, 0.50, (new Disk(10, 20)), "383JPL"));
		PClist.add(new PC(1000, 1.10, (new Disk(100, 80)), "Q005JE"));
		PClist.add(new PC(500, 0.10, (new Disk(10, 10)), "997FJ9"));
	}
	
	static void displaylist(){
		
		for(int i=0; i<PClist.size(); i++){
			System.out.print( "PC#" + (i+1) + ": " + 
								PClist.get(i).price + " | " +  
								PClist.get(i).performance + " | (" + 
								PClist.get(i).disk_space.disk1 + ", " + PClist.get(i).disk_space.disk2 + ") | " +
								PClist.get(i).serial_id + "\n"
					);
		}
		System.out.println();
		
	}
	
}


