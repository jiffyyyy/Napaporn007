import java.util.Scanner;

public class Calculator {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
	
		Scanner SC = new Scanner (System.in) ;
		
		System.out.print("กรอกตัวเลขที่  1 : ");
		int n1 = SC.nextInt();
		
		System.out.print("กรอกตัวเลขที่  2 : ");
		int n2 = SC.nextInt();
		
		System.out.print("กรอกตัวเลขที่  3 : ");
		int n3 = SC.nextInt();
		
		int multiplyNumber = n1 + n2 + n3 ;
		System.out.println("multiplyNumber = "+ n1+" + "+n2+" + "+n3+" = "+multiplyNumber );
		
		int price = 1000;
		double calVat7 = (price/100)*7 ;
		System.out.println("Var = "+calVat7);
		
		double calTotalPrice = price + calVat7;
		System.out.println("TotalPrice = " +calTotalPrice);
	}
}