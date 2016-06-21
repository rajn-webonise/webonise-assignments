
public class PCTower extends PC {

	PCTower(String name) {
		super(name, "TOWER");
		this.chassis  = new TowerChassis();
		this.cabinet = new TowerCabinet();
	}
	
	

}
