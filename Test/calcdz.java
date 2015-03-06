package calc;
import java.util.Scanner;

public class calcdz {
	public static void main (String args[])
	{
		int a,b,x;
		  int sign;
		System.out.println("\t\tКалькулятор");
		System.out.println(" 1 (сложение)");
		System.out.println(" 2 (вычетание)");
		System.out.println(" 3 (умножение)");
		System.out.println(" 4 (деление)");
		System.out.println("\tВыберите действие");
		Scanner scn= new Scanner(System.in);
		sign=scn.nextInt();
		System.out.println("Введите первое число");
		a=scn.nextInt();
		System.out.println("Введите второе число");
		b=scn.nextInt();
		
		
		
		if(sign==1)
		{
			x=a+b;
			System.out.println("Ответ "+x);
		}
		if(sign==2)
		{
		x=a-b;
		System.out.println("Ответ "+x);
		}
		if(sign==3)
		{
			x=a*b;
			System.out.println("Ответ "+x);
		}
		if(sign==4)
		{
			x=a/b;
			System.out.println("Ответ "+x);
		}
	
			
			
		
		
		
		
		
		
	}

}
