import java.util.Comparator;
import java.util.List;


public class SortPC {
	
	static List<PC> sort(List<PC> PClist, String field){
		
		System.out.println("Sorting via " + field);
		
		if(field.equalsIgnoreCase("PRICE")){
			PClist.sort(new PriceComparator());
			return PClist;
		}
		else if(field.equalsIgnoreCase("PERFORMANCE")){
			PClist.sort(new PerformanceComparator());
			return PClist;
		}
		else if(field.equalsIgnoreCase("DISK")){
			PClist.sort(new DiskComparator());
			return PClist;
		}
		else if(field.equalsIgnoreCase("SERIAL")){
			PClist.sort(new SerialComparator());
			return PClist;
			
		}
		
		return null;
	}
}

class PriceComparator implements Comparator<PC> {

    public int compare(PC p1, PC p2) {
        return (p1.price>p2.price)?1:-1;
    }
}


class PerformanceComparator implements Comparator<PC> {

    public int compare(PC p1, PC p2) {
        return (p1.performance>p2.performance)?1:-1;
    }
}

class DiskComparator implements Comparator<PC> {

    public int compare(PC p1, PC p2) {
        return ((p1.disk_space.disk1 + p1.disk_space.disk2)>(p2.disk_space.disk1 + p2.disk_space.disk2))?1:-1;
    }
}

class SerialComparator implements Comparator<PC> {

    public int compare(PC p1, PC p2) {
        return p1.serial_id.compareTo(p2.serial_id); //(p1.price>p2.price)?1:-1;
    }
}

