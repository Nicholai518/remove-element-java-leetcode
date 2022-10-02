public class Main {
    public static void main(String[] args) {
        int[] arrayOne = new int[]{3, 2, 2, 3};
        int[] arrayTwo = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        int[] arrayThree = new int[]{1, 1, 1, 1, 1};
        int[] arrayFour = new int[0];

        Solution solution = new Solution();

        System.out.println("arrayOne: " + solution.removeElement(arrayOne, 3));
        System.out.println("arrayTwo: " + solution.removeElement(arrayTwo, 2));
        System.out.println("arrayThree: " + solution.removeElement(arrayThree, 8));
        System.out.println("arrayFour: " + solution.removeElement(arrayFour, 1));
    }
}
