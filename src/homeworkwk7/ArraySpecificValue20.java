package homeworkwk7;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class ArraySpecificValue20 {
    public static void main(String[] args) {
        int[] array = new int[]{20, 35, 25, 35, -16, 60, -100,  34};

        findVal(array, 60);
        findVal(array, 15);
        findVal(array, 34);

    }

    public static void findVal(int[] array, int val) {
        for (int i = 0; i < array.length; i++) {
            if(array[i]== val){
                System.out.println("found the value..." + val + ", index=" + i);
            }
        }
    }
}
