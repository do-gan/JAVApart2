import lombok.*;
@Getter
@Setter
@AllArgsConstructor
@ToString
class Address
{
	private String street;
	private String city;
	private String pinCode;
}
@Getter
@Setter
@AllArgsConstructor
@ToString
class Person
{
	private String name;
	private int age;
	private Address address;
}
class Detail
{
	public static void main(String[]args)
	{
		Address address= new Address("dum-dum","Kolkata","700028");
		Person person= new Person("you",20,address);
	System.out.println(person);
	}
}
		
	