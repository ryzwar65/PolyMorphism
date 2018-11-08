public class Main{
	public static void main(String[] args) {
		Main m = new Main();
		Prajurit pr = new Prajurit();
		Ak47 ak = new Ak47();
		Bazooka baz = new Bazooka();

		pr.setSenjata(new Ak47());

		pr.menembak(); 
		pr.setSenjata(new Bazooka());
		pr.menembak();
	}
}