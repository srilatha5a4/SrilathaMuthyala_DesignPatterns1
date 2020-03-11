package design;

public class Small extends Car{

	 Small() {
		super(Cartype.SMALL);
		construct();
		// TODO Auto-generated constructor stub
	}
	 public void construct(){
		 System.out.println("Building small car");
	 }

}