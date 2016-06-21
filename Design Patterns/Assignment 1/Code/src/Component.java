
public class Component {
	
	double price;
	double wattage;
	
	Component(double price, double wattage){
		this.price = price;
		this.wattage = wattage;
	}
	
	public double netPrice(){
		return this.price;
	}
	public double powerConsumption(){
		return this.wattage;
	}

}
