package Transport;

public class TransportMainApp {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//		new Auto();
//		new Auto();
//		new Auto();
//		
//		Auto a;
		
		
		Auto auto = new Auto("fiat", new Engine(1.4f));
		
		auto.setEngine(new Engine(1.6f));
		
		System.out.println(auto.getMark() + ", " + auto.getEngine().getVolume() + ", " + auto.getColor());
		
		auto.upgrade(new Engine(1.8f), "black");
		System.out.println(auto.getMark() + ", " + auto.getEngine().getVolume() + ", " + auto.getColor());
		
		Track track = new Track();
		
		Bus bus = new Bus();
		
		System.out.println();
		
	}

}
