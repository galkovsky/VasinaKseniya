import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	System.out.println("Для завершения программы ввести Exit");
	
	double num1 = 0;
	double num2 = 0;
    String op = null;
    
    double result = 0;
	
	Scanner scan = new Scanner (System.in);
	String str = null;	
	
	while(true){
		
		System.out.println("Введите первое число ");
		if(scan.hasNext()) {
			str = scan.nextLine();			
			
			 
			if(str.equals("Exit")){                
				break;
			}                                     
			
			num1 = new Double(str);			
			
		}
		
		System.out.println("Выберите операцию +, -, *, /");
		if(scan.hasNext()) {
			op = scan.nextLine();
			
			if(op.equals("Exit")){                
				break; 
			}									
		}
		
		System.out.println("Введите второе число");
		if(scan.hasNext()) {
			str = scan.nextLine();
			
			if(str.equals("Exit")){               
				break;
			}										
			
			num2 = new Double(str);
		}
		
	//	if("+".equals(op)){
	//		result = num1 + num2;
	//	}
	//	else if("-".equals(op)){
	//		result = num1 - num2;
	//	}
	//	else if("/".equals(op)){
	//		result = num1 / num2;
	//	}
	//	else if("*".equals(op)){
	//		result = num1 * num2;
	//	}
	
		
		switch(op){
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
		}
		
		
		System.out.println("Результат вычислений: " + result);
	}
	
	scan.close();
  }
}