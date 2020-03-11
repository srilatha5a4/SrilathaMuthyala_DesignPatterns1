package design;

public class Factory {
	public static Car buildCar(Cartype model){
		 Car car = null;
	        switch (model) {
	        case SMALL:
	            car = new Small();
	            break;
	        case LUXURY:
	            car = new Luxury();
	            break;
	 
	        default:
	            break;
	        }
	        return car;
		
	}
}

