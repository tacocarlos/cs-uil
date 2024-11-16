public class Average {

    public static double computeAverage(int[] nums) {
        double sum = 0.0;
        for(int number : nums) {
            sum += number;
        }

        /*
         * Using a normal for loop
         * for(int i = 0; i < nums.length; i++) {
         *     sum += nums[i];
         * }
         */

        return (sum / nums.length);
    }

    public static void main(String[] args) {
        int[] numbers = { 0, 1, 3, 4,
            5 // everything doesn't have to be on the same line
        };

        System.out.println(computeAverage(numbers)); // prints "13"
    }
}