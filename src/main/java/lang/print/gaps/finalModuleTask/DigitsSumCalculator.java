package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = number % 10;
        int firstNumber = number / 10;
        int second = firstNumber % 10;
        sum = sum + second;
        int secondNumber =  firstNumber / 10;
        int third = secondNumber % 10;
        sum = sum + third;
        int thirdNumber = secondNumber/10;
        int fourth = thirdNumber%10;
        sum = sum + fourth;
        System.out.println(sum);
    }
}