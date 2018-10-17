


public class calculatorServlet {
	
	public String calculatorAdd (String number1, String number2) {
		
		int result1 = Integer.parseInt(number1);
		int result2 = Integer.parseInt(number2);
		int result = result1+result2;
		
		return "The value of the numbers is: "+ result;
	}
	

	public String calculatorSubtract (String number1, String number2) {
		
		int result1 = Integer.parseInt(number1);
		int result2 = Integer.parseInt(number2);
		int result = result1-result2;
		
		return "The value of the numbers is: "+ result;
	}
	
	public String calculatorMultiply (String number1, String number2) {
		
		int result1 = Integer.parseInt(number1);
		int result2 = Integer.parseInt(number2);
		int result = result1*result2;
		
		return "The value of the numbers is: "+ result;
	}
	
	public String calculatorDivide (String number1, String number2) {
		
		int result1 = Integer.parseInt(number1);
		int result2 = Integer.parseInt(number2);
		if (result2 == 0) {
			return "Number 2 cannot be 0";
		}
		int result = result1/result2;
		return "The value of the numbers is: "+ result;
	}
}
