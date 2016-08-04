import java.util.List;


public class PC {
	
	int price;
	double performance;
	Disk disk_space;
	String serial_id;
	
	PC(int price, double performance, Disk disk_space, String serial_id){
		this.price = price;
		this.performance = performance;
		this.disk_space = disk_space;
		this.serial_id = serial_id;
	}
	
}

class Disk{
	int disk1;
	int disk2;
	
	Disk(int disk1, int disk2){
		this.disk1 = disk1;
		this.disk2 = disk2;
	}
}