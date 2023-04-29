public class Kata {
    public static int findEvenIndex(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int sumBe = 0;
            int sumAf = 0;
            for(int be = 0; be < i; i++) {
                sumBe = sumBe + arr[be];
            }
            for(int af = i + 1; af < arr.length; af++) {
                sumAf = sumAf + 1;
            }
            if(sumAf == sumBe) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.printf(String.valueOf(findEvenIndex(new int[] {1, 2, 3, 10, 3, 2, 1})));
    }
}