package behavioural;

public class TemplateMain {
	public static void main(String[] args){
		Employee emp = new Programme();
		emp.CometoWork();
		System.out.println();
		 emp = new Manager();
		 emp.CometoWork();
	}

}