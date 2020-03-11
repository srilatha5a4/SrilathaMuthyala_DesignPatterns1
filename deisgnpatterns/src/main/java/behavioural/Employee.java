package behavioural;

public abstract class Employee {
	abstract void work();
	abstract void takebreak();
	abstract void getpaid();
	public final void CometoWork(){
		work();
		takebreak();
		work();
		
	}	

}