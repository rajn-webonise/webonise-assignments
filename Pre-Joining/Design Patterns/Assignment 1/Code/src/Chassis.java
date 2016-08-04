
import java.util.ArrayList;
import java.util.List;

class Chassis extends Component{
		
	public List<Component> ChassisComponent = new ArrayList<Component>();	

	Chassis(double price, double wattage){
		
		super(price, wattage);
		
		ChassisComponent.add(new FloppyDisk(100, 5.4));
		ChassisComponent.add(new CPU(40, 100));
		ChassisComponent.add(new Bus(10.9, 40.5));
		
	}
	
}
	
class FloppyDisk extends Component{
	
	FloppyDisk(double price, double wattage){
		super(price, wattage);
	}
	
}	

class CPU extends Component{

	CPU(double price, double wattage){
		super(price, wattage);
	}
	
}

class Bus extends Component{
	
	NetworkCard network_card;
	
	Bus(double price, double wattage){
		super(price, wattage);
		network_card = new NetworkCard(50, 10.4);
	}
	
}	

class NetworkCard extends Component{
	NetworkCard(double price, double wattage){
		super(price, wattage);
	}
}