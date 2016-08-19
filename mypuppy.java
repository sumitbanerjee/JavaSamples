package test2016;

public class mypuppy {
	//instace variable 
	int puppyAge;
	
	//constructor
	public mypuppy (String name)
	{
		System.out.println("Passed name is : "+ name);
	}
	
	//Method1
	public void setAge(int age)
	{
		int a =5;
		puppyAge = age;
		
		
	}
	//mETHOD
	public int getAge()
	{
		System.out.println("Puppy age is "+ puppyAge);		
		return puppyAge;
		
	}
	
	public int add()
	{
		int a =1;
		int b = 5;
		int c = a+b;
		return c;
		
	}
	
	public void sub()
	{
		int a = 10;
		int b = 5;
		int c = a-b;
		System.out.println("Print void:"+ c );
		
	}
	
	private void mul()
	{
		System.out.println("This is private method");
	}
	
	public void doMul() {
		this.mul();
	}
	
	//Object
	public static void main(String[]args)
	{
		mypuppy puppy = new mypuppy("tommy");
		
		//call class method 
        puppy.setAge(222);
        
        //cALL METHOD 2
        puppy.getAge();
        System.out.println("Age: "+ puppy.puppyAge);
        System.out.println("Print the num: " + puppy.add());
      
        //System.out.println(puppy.setAge());
        puppy.sub();
        
        puppy.doMul();
	}
}


