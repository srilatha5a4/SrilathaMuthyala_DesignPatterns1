package design;

public class Mainbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User.UserBuilder("Merry", "Joseph")
				.age(25)
				.phone("9860594241")
				.address("Hyderabad")
				.build();
		System.out.println(user1);
		User user2 = new User.UserBuilder("Abraham", "Sarah")
				.age(90)
				//no number
				.address("Isral")
				.build();
		System.out.println(user2);

	}

}