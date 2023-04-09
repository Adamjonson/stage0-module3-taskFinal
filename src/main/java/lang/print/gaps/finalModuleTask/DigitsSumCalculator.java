package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int four = number / 1000;
        int three = (number - four) / 100;
        int two = (number - four - three) / 10;
        int one = (number - four - three - two);
        int sum = four + three + two + one;
        System.out.println(sum);
    }
}
