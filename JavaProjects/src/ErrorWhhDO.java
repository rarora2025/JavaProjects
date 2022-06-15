public class ErrorWhhDO {
	int x = 10;
	int y = 20;
	int z = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Test test = new Test(33);
	Test test2 = new Test(33);
	
	System.out.println(test==test2);

	
	//variables that are not static (instance) cannot be used without an object
	//if you use an instance variable within a class, without an object name, you are referring to the object that will be created 
	//if you are within the class, you can access the instance variable of another object of the same class by object.variableName, or outisde of class access by object.getVariableName();

	
	}
	


}
