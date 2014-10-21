package numberPrintout;

public class Number {
	private int number;
	private int length;
	private String numberPrint;
	
	public Number(int number) {
		super();
		this.number = number;
		this.length = this.getLength();
		this.numberPrint = "";
	}
	
	
	
	@Override
	public String toString() {
		return "Number: " + number + " Length: " + length + " Written number: " + numberPrint;
	}

	

	public String getNumberPrint() {
		return numberPrint.toString();
	}



	public void setNumberPrint(String numberPrint) {
		this.numberPrint +=  numberPrint + " ";
	}



	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getLength() {
		StringBuilder str = new StringBuilder();
		str.append(this.number);
		return str.length();
	}
	
	public void setLength(int length) {
		StringBuilder str = new StringBuilder();
		str.append(this.getNumber());
		this.length = str.length();
	}
	
	public boolean isSingleDigit(){
		return 	this.getLength() ==2 ? true : false;
	}
	
	
	
//	public void choosePrintout(){
//		int num = this.getLength();
//		
//		if(num == 1)
//			printSingleDigit();
//		else if(num == 2){
//			printDoubleDigit();
//		}
//		else if(num ==  3){
//			printTripleDigit();
//		}
//		else if(num ==  4){
//			printFourDigits();
//		}
//		else if(num ==  5){
//			printFiveDigits();
//		}
//		else if(num ==  6){
//			printSixDigits();
//		}
//		else if(num ==  7){
//			printSevenDigits();
//		}
//		else if(num > 7){
//			System.out.println("number too large");
//			break;
//		}
//		
//	}
	
	public void handleOnes(){
		StringBuilder str = new StringBuilder();
		StringBuilder strOutput = new StringBuilder();
		str.append(this.getNumber());
		
		if(str.charAt(0) == '1' && str.length() > 2){
			strOutput.append("ett");
			this.setNumberPrint(strOutput.toString());
		}
		else if(str.charAt(this.getLength()-1) == '1'){
			strOutput.append("en");
			System.out.println("asdf: " +strOutput);
			this.setNumberPrint(strOutput.toString());
		}
		
	}
	
//	> 1 >10 >100 >1000 >100 000 > 1 000 000 > 	
	
	
	
	
}
