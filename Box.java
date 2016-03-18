
public class Box {

	public double l;
	public double w;
	public double h;
	
	public Box(){
		l = 1.0;
		w = 2.0;
		h = 3.0;
	}
	
	public Box(double len, double wid, double hei){
		l = len;
		w = wid;
		h = hei;
	}
	
	public Box(double len,double wid){
		l = len;
		w = wid;
		h = 10.0;
	}
	
	public double volume(){
		return l*w*h;
	}
}

