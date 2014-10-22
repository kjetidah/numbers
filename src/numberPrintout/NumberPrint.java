package numberPrintout;

public class NumberPrint {
	public static void main(String[] args) {
		Number num = new Number(30);
	
		num.choosePrintout(num.getNumber());
		System.out.println(num);
	}
	
}