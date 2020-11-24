package sudha.mycodingjourney;

//import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator sc=new Calculator();
		//Scanner a1=new Scanner(System.in);
	//	a1.nextInt();
	//	Scanner b1=new Scanner(System.in);
		//b1.nextInt();
		int a=5,b=10;
		sc.add(a,b);
		sc.subtract(a, b);
		sc.divider(a, b);
		sc.multipy(a, b);
		sc.modulus(a, b);
}

}
