package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = number / 100;
        int tens = (number - hundreds * 100) / 10;
        int digits = (number - hundreds * 100 - tens * 10);
        System.out.println(digits + "" + tens + "" + hundreds);
    }
}
