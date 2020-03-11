package design;

public class Luxury extends Car{
	 Luxury() {
		super(Cartype.LUXURY);
		construct();
		// TODO Auto-generated constructor stub
	}

	public void construct(){
		System.out.println("Building luxury car");
		
	}

}
