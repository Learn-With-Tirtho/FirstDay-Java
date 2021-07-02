
public class DataType {

	public static void main(String[] args) {

		char firstLatter = 'a';
		
		byte age = 127;
		
		short population = 30000;
		
		int totalPoputaion = 15_42_555;
		
		float ballance = 2945.8f;
		
		double totalBallance = 354355432;
		
		long a =472945723;
		
		boolean isPermiteded = false;
		
		byte b =120;
		byte c = 10;
		
		short d =4;
		
		byte result = (byte)(b+c); 
		
		short resultD = (byte)(d+c);
		
		System.out.println(result); //-128, -127, -126
		
		Student student = new Student();
		student.address = "Dhaka 100";
		student.name = "John Dew";
		student.roll =20;
		student.regNo=2456;
		
		
		System.out.println(student.name);
		
		
	}

}

class Student{
	int roll;
	String name;
	int regNo;
	String address;
}











