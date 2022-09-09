package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
    	int sumOfDigits = 0;
	while (number != 0) {
		sumOfDigits = sumOfDigits + number % 10;
		number = number / 10;
	}
	System.out.println(sumOfDigits);



    }
}
