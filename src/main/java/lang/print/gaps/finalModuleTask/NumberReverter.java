package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        if (number < 10)
        {
            System.out.println(number);
        }
        else
        {
            System.out.print(number % 10);
            revert(number/10);
        }
    }
}
