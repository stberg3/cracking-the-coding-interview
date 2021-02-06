package arraystring;

/**
 * Implement an algorithm to shift the elements in an array
 */

class _x_ArrayShift {

    
    private static void shiftOne(int[] arr) {
        for(int i= arr.length - 1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = 0;
    }

    public static int[] shiftArray(int[] arr, int n) {
        for(int i=0; i<n; i++) {
            shiftOne(arr);
        }
            
        return arr;
    }

    private static void shiftOne(char[] arr, int idx) {
        for (int i = arr.length - 1; i > idx; i--) {
            arr[i] = arr[i - 1];
        }
        arr[idx] = 0;
    }

    private static void shiftOne(char[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = 0;
    }

    public static char[] shiftArray(char[] arr, int n, int idx) {
        for (int i = 0; i < n; i++) {
            shiftOne(arr, idx);
        }

        return arr;
    }

    public static char[] shiftArray(char[] arr, int n) {
        for (int i = 0; i < n; i++) {
            shiftOne(arr);
        }

        return arr;
    }

}
