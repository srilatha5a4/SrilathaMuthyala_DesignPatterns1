package design;

public class User {
	private final String firstname;
	private final String lastname;
	private final int age;
	private final String phone;
	private final String address;
	private User(UserBuilder builder){
		this.firstname = builder.firstname;
		this.lastname = builder.lastname;
		this.age=builder.age;
		this.phone=builder.phone;
		this.address=builder.address;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddress() {
		return address;
	}
	public String toString(){
		return "User:"+this.firstname+","+this.lastname+","+this.age+","+this.phone+","+this.address;
		
	}
	public static class UserBuilder{
		private final String firstname;
		private final String lastname;
		private  int age;
		private String phone;
		private  String address;
		public UserBuilder(String firstname,String lastname){
			this.firstname=firstname;
			this.lastname=lastname;
			
		}
		public UserBuilder age(int age){
			this.age = age;
			return this;
		}
		public UserBuilder phone(String phone){
			this.phone = phone;
			return this;
		}
		public UserBuilder address(String address){
			this.address = address;
			return this;
		}
		public User build(){
			User user = new User(this);
			Validateuserobject(user);
			return user;
		}
		private void Validateuserobject(User user) {
			// TODO Auto-generated method stub
			
		}
		
	}

}
