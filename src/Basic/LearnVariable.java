package Basic;

public class LearnVariable {
	
	
	// What is variable?
	// Variable is a container
	// Variable name must have to be meaningful
	// follow camelCase or snack_case
	
	//DataType variableName = variableValue;
	
	// Global variable
	int a       =        5;
	int b  =6;
	
	int c   =  5 ; // Hard code
	int d   =  b ; // Dynamic code: When a value of a variable is dependent on another variable, it is dynamic. 
	
	// Declare Variable
	int age;
	
	// Declare and Initialize value
	int salary= 5000;
	
	int augustSalary=6000;
	
	
	//Non Static Global Variable
	int number=50;
	
	// Static Global Variable
	static int quantity=37;
	static double length=23.5;
	
	/**
	 * Types of Variable:
	 * Global variable/ Instance variable
	 * Non Static Global Variable: call by Object Name
	 * Static Global Variable: Call by class Name from any class.
	 * 
	 * 
	 * Local Variable: Any variable inside any method is called local variable
	 */
	
	public static void main(String[] args) {
		// local variable call by variable name
		int price=30;
		System.out.println(price);
		
		System.out.println(LearnVariable.quantity);
		System.out.println(LearnVariable.length);
		System.out.println(HelloWorld.number2);
		
		
		// Create a Object and then call by object name
		//Object create from a class
		// className objectName = new constructorOfClass();
		
		LearnVariable obj = new LearnVariable();
		System.out.println(obj.salary);
		
		
		HelloWorld hw= new HelloWorld();
		System.out.println(hw.number3);
		
		obj.display();
		
		
	}
	
	
	public void display() {
		int num=33; // local variable
		System.out.println(num);
		
	}
	
	
	

}
