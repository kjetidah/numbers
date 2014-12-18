package numberPrintout;

public class Number {
	private int number;
	private int length;
	private String numberPrint;
	private StringBuilder str = new StringBuilder();
	
	public Number(int number) {
		super();
		this.number = number;
		this.length = this.getLength();
		this.numberPrint = "";
		this.str.append(this.getNumber());
	}
	
	
	
	@Override
	public String toString() {
		return "Number: " + number + " Length: " + length + " Written number: " + handleOnes(numberPrint);
	}

	

	public String getNumberPrint() {
		return numberPrint;
	}



	public void setNumberPrint(String numberPrint) {
		this.numberPrint +=  numberPrint;
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
	
		else if(a.length() ==  3){
			printTripleDigits(num);
		}
	
		else if(a.length() ==  4){
			printFourDigits(num);
		}
	}
//		else if(a.length() ==  5){
//			printFiveDigits(num);
//		}
//		else if(a.length() ==  6){
//			printSixDigits(num);
//		}
//		else if(a.length() ==  7){
//			printSevenDigits(num);
//		}
//		else if(a.length() > 7){
//			System.out.println("number too large");
//			break;
//		}
//		
//	}
	
	public int getFirstDigit(){
		return (int)str.charAt(0)-48;
	}
	
	public int getXDigits(int digitAmount){
		System.out.println(str.toString());
		str.delete(0, str.length()-digitAmount);
		System.out.println("parsed shit: "+ Integer.parseInt(str.toString()));
		return Integer.parseInt(str.toString());
	}
	

	
	public String handleOnes(String numberPrint){
		String numberFix = "";
		numberFix = numberPrint;
		if(this.getLength() > 1)
			numberFix.replaceAll("null", "");
		if(getFirstDigit() == 1){
			numberFix = numberPrint.substring(0,2).replace("en","ett");
			numberFix +=numberPrint.substring(3, numberPrint.length());
		}else{
		 System.out.println("mordi");
		}
		return numberFix;
		
	}
	
	public void printSingleDigits(int num){
		System.out.println("print1digit");
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
			default:
				break;
		}
	}

	public void printDoubleDigits(int num){
		if( num > 9 && num <20){
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
			}
		}
		else if (num % 10 != 0){
			int b = num - (num%10);
			this.printDoubleDigits(b);
			this.printSingleDigits(str.charAt(str.length()-1)-48);		
			
		}else if ((num %10) == 0){
			switch(num){
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
		}
	}
	
	public void printTripleDigits(int num){
		System.out.println("print3digits");
		//adds the first digit to the number (hundreds)
		printSingleDigits(getFirstDigit());
		
		setNumberPrint("hundre og ");
		//prints the remaining number
		System.out.println("mordi");
		System.out.println("2 digits: " +getXDigits(2));
		printDoubleDigits(getXDigits(2));
	}
	
	public void printFourDigits(int num){
		System.out.println("print4digits");
		System.out.println(str);
		printSingleDigits(getFirstDigit());
	
		setNumberPrint("tusen ");
		printTripleDigits(getXDigits(3));
		System.out.println(str);
		printDoubleDigits(getXDigits(2));
		
		
		
	}
	
	
	
//	> 1 >10 >100 >1000 >100 000 > 1 000 000 > 	
	
	
	
	
}
