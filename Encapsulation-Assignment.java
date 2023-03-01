
Q1. What is Encapsulation in Java. why it is called data binding?

Ans-> Information Hiding
* Hiding implementation details of an object from its user.
* Packaging things together and presenting them in their new integrated form.
* For example, two or more chemicals form a capsule
* Packaging the methods and attributes together in a single unit.
* Units are implement in the form of classes.

.Note-> "The process of hiding attributes, methods or details of implementation is called Encapsulation."

Q2. What are the important features of encapsulation?

Ans-> these are important features of encapsultion .
* We can achieve security.
* Enhance become's easy
* Maintainability and modularisation becomes easy.
* It provides flexibility to the user to use the system very easily.

Q3.What are getter and setter methods in Java Explain with an example.?
Ans-> Getter method is used to get the value from the instance variable of the class.
* Syntax for getter method.

* compulsory the method name should start with get.
* it should be public.
* return type should not be void.
* compulsory it should not have argument.

Setter.-> setter methods are used to set the value from the instance variable of the class.

* Syntax for setter method
* method name should start with set, it should be public, return type should be void compulsory it should have some argument.

Example..

package encapsulationassignment;


class Manager{
	
	private int age;
	private String name;
	private float salary;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public void display() {
		
		System.out.println("*************** Manager Details ************************");
		
		System.out.println(age + " " + name + " " + salary);
	}
	
	
}

public class GetterSetterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager mg = new Manager();
		
		mg.setAge(23);
		mg.setName("Videsh Pundir");
		mg.setSalary(45000);
		
		mg.getAge();
		mg.getName();
		mg.getSalary();
		mg.display();

	}

}


Q4. What is the use of this keyword explain with an example?

Ans-> this keyword is used to refer to current object
* this is always  a reference to the object on which method was invoked.
* this can be used to invoked current class connstructor
* this can be passed as an argument to another method.

Example->

package encapsulationassignment;




public class Employee {
	
	int empId;
	String name;
	
	
public Employee(int empId, String name) {
		
		this.empId = empId;
		this.name = name;
	}
	

void display() {
	
	System.out.println("*********** Employee Details ************");
	
	
	System.out.println(this.empId + " " + this.name);
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(11, "Videsh");
		
		emp.display();

	}


}

Q.5What is the Advantage of Encapsulation??
Ans->
* Data Hiding.
* Increased Flexibility.
* Reusability
* Testing Code is Easy.

Q6.How to Achieve Encapsulation in Java? Give an Example.

Ans->


package encapsulationassignment;


// A java class which is encapsulated class
//it has private data member and getter and setter methods


// instance class
public class Student {

	
	//private data member
	
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	// getter and setter method
	
	
	
	
	

}

// Main file StudentTest.java


package encapsulationassignment;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.setName("Videsh Pundir");
		s.setAge(22);
		
		System.out.println(s.getName() + " " + s.getAge());

	}

}










