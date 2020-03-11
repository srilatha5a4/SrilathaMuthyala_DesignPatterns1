package behavioural;

public class IteratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std = new Students();
		for(Iterator itr = std.getIterator();itr.hasnext();){
			String student = (String)itr.next();
			System.out.println("Students:"+student);
		}

	}

}