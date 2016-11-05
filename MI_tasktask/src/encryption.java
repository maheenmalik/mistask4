import java.util.Scanner;
public class Encryption {

	public Encryption() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		System.out.println("Enter the name of user");
		
		Scanner input= new Scanner(System.in);
		name= input.next();
		
		System.out.println("name of user is "+name);
		
		Convertor(name);

	}
	static int Convertor(String l){
		int sum=0;
		
		for(int i=0;i<l.length();i++)
		{
			sum= i+1;
			
			
		}
		return sum;
	}

}
