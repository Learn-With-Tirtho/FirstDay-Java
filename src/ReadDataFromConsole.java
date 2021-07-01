import java.util.Scanner;

public class ReadDataFromConsole {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		System.out.println("Hello "+ scanner.nextLine());
		
		System.out.println(scanner.nextInt() + scanner.nextInt());
	}

}
