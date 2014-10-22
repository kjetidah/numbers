package numberPrintout;

public class Number {
	private int number;
	private int length;
	private String numberPrint;
	StringBuilder str = new StringBuilder();
	
	public Number(int number) {
		super();
		this.number = number;
		this.length = this.getLength();
		this.numberPrint = "";
		this.str.append(this.getNumber());
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
	
	
	
	public void choosePrintout(int num){
		StringBuilder a = new StringBuilder();
		a.append(num);
		
		if(a.length() == 1)
			printSingleDigits(num);
		else if(a.length() == 2){
			printDoubleDigits(num);
		}
	}
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
		
		StringBuilder strOutput = new StringBuilder();
	
		
		if(str.charAt(0) == '1' && str.length() > 2){
			strOutput.append("ett");
			this.setNumberPrint(strOutput.toString());
		}		else if(str.charAt(this.getLength()-1) == '1'){
			strOutput.append("en");
			System.out.println("asdf: " +strOutput);
			this.setNumberPrint(strOutput.toString());
		}
		
	}
	
	public void printSingleDigits(int num){
		
		switch(num){
			case 0:
				this.setNumberPrint("null");
				break;
			case 1:
				this.setNumberPrint("en");
				break;
			case 2:
				this.setNumberPrint("to");
				break;
			case 3:
				this.setNumberPrint("tre");
				break;
			case 4:
				this.setNumberPrint("fire");
				break;
			case 5:
				this.setNumberPrint("fem");
				break;
			case 6:
				this.setNumberPrint("seks");
				break;
			case 7:
				this.setNumberPrint("sju");
				break;
			case 8:
				this.setNumberPrint("åtte");
				break;
			case 9:
				this.setNumberPrint("ni");
				break;
		}
	}

	public void printDoubleDigits(int num){
//		if( num % 10 != 0|| (num == 10 ||num == 20 )){
			switch(num){
			case 10:
				this.setNumberPrint("ti");
				break;
			case 11:
				this.setNumberPrint("elleve");
				break;
			case 12:
				this.setNumberPrint("tolv");
				break;
			case 13:
				this.setNumberPrint("tretten");
				break;
			case 14:
				this.setNumberPrint("fjorten");
				break;
			case 15:
				this.setNumberPrint("femten");
				break;
			case 16:
				this.setNumberPrint("seksten");
				break;
			case 17:
				this.setNumberPrint("sytten");
				break;
			case 18:
				this.setNumberPrint("atten");
				break;
			case 19:
				this.setNumberPrint("nitten");
				break;
			case 20:
				this.setNumberPrint("tjue");
				break;
			case 30:
				this.setNumberPrint("tretti");
				break;
			case 40:
				this.setNumberPrint("førti");
				break;
			case 50:
				this.setNumberPrint("femti");
				break;
			case 60:
				this.setNumberPrint("seks");
				break;
			case 70:
				this.setNumberPrint("sytti");
				break;
			case 80:
				this.setNumberPrint("åtti");
				break;
			case 90: 
				this.setNumberPrint("nitti");
				break;
			}
//		}else if (num % 10 == 0){
//			System.out.println("her kom du");
//			str.append(num);
//			char firstNumber = str.charAt(0);
//			
//			System.out.println(firstNumber);
//			String a = Character.toString(firstNumber);
//			int b = Integer.parseInt(a);
//			
//			this.printSingleDigits(b);
//			setNumberPrint("ti");
	//			str.append("ti");
	//			System.out.println("etter fix" +str);
			
			
			
//		}
	}
	
	public void printTripleDigits(){
		
	}
	
	
	
//	> 1 >10 >100 >1000 >100 000 > 1 000 000 > 	
	
	
	
	
}
