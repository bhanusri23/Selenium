
public class TestBox {

	public static void main(String[] args) {
		Box a = new Box();
		
		System.out.println(a.volume());
		
		a.l = 10.0;
		a.w = 20.0;
		a.h = 30.0;
		System.out.println(a.volume());
		
		Box c = new Box(11.11,22.22,33.33);
		System.out.println(c.volume());
		
		Box z = new Box(23,24);
		System.out.println(z.volume());
		
		
	
				

	}

}

