public class App {
    public static void main(String[] args) {
        int[] numbers = {-1, 0, 1, 9, 10};
        for (int number : numbers) {
            boolean greaterThanZero = (number > 0);
            boolean lessThanTen = (number < 10);
            boolean betweenZeroAndTen = (number > 0 && number < 10);
            boolean notBetweenZeroAndTen = !(number > 0 && number < 10);
            boolean greaterThanZeroOrLessThanTen = (number > 0 || number < 10);

            System.out.println("number: " + number);
            System.out.println("number > 0: " + greaterThanZero);
            System.out.println("number < 10: " + lessThanTen);
            System.out.println("number > 0 && number < 10: " + betweenZeroAndTen);
            System.out.println("!(number > 0 && number < 10): " + notBetweenZeroAndTen);
            System.out.println("number > 0 || number < 10: " + greaterThanZeroOrLessThanTen);
            System.out.println("--------------------------------");
        }
    }
}
/*
        | number | number > 0 | number < 10 | number > 0 && number < 10 | !(number > 0 && number < 10) | number > 0 || number < 10 |
        | ------ | ---------- | ----------- | ------------------------- | --------------------------- | ------------------------- |
        | -1     | false      | true        | false                      | true                        | true                      |
        | 0      | false      | true        | false                      | true                        | true                      |
        | 1      | true       | true        | true                       | false                       | true                      |
        | 9      | true       | true        | true                       | false                       | true                      |
        | 10     | true       | false       | false                      | true                        | true                      |
*/