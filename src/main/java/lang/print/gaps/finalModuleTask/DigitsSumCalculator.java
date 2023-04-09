package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int four = number / 1000;
        int three = (number - four * 1000) / 100;
        int two = (number - four * 1000 - three * 100) / 10;
        int one = (number - four * 1000 - three * 100 - two * 10);
        int sum = four + three + two + one;

        System.out.println(sum);
    }
}
