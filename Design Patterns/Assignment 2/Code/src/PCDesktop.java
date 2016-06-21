
public class PCDesktop extends PC {
	
	PCDesktop(String name) {
		super(name, "DESKTOP");
		this.chassis  = new DesktopChassis();
		this.cabinet = new DesktopCabinet();
	}
	
}
