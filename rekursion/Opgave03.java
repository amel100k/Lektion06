package rekursion;

import java.lang.reflect.Array;

public class Opgave03 {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6};
        //System.out.println("findHeltalIArray(intArray,3) = " + findHeltalIArray(intArray, 3));
        System.out.println("findHeltalIArray2(intArray,3) = " + findHeltalIArray2(intArray, 2));
    }

    public static boolean findHeltalIArray(int[] array, int target) {
        boolean found = false;
        int i = 0;
        while (!found && i < array.length) {
            int k = array[i];
            if (k == target) {
                found = true;
            } else i++;
        }
        return found;
    }

    public static int findHeltalIArray2(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        return findHeltalIArray2(array, target, low, high);
    }

    private static int findHeltalIArray2(int[] array, int target, int low, int high) {
        int result = 0;
        if (low > high) {
            result = -low - 1;
        }
        int middle = (low + high) / 2;
        if (target < array[middle]) {
            result = findHeltalIArray2(array, target, low, middle - 1);
        } else if (target == array[middle]) {
            result = middle;
        } else result = findHeltalIArray2(array, target, middle + 1, high);
        return result;
    }
}
