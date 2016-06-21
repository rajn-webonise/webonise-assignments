
public class Cabinet extends Component {
	
	Chassis chassis;

	Cabinet(double price, double wattage) {
		super(price, wattage);
		this.chassis = new Chassis(800, 0);
	}

	

}
