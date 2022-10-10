public class BinarySearchDemo {

    public static void main(String[] args) {
        int[] list = {4, 6, 7, 20, 12, 13};

        int index = binarySearch(list, 6);
        System.out.println("6 was found at" + index);
    }

    public static int binarySearch(int array[], int key){
        int low = 0;
        int high = array.length - 1;
        int middle;
        while(low<= high){
            middle = (low + high) / 2;

            if ( key == array[ middle])
                return middle;
            else if ( key < array[middle])
                high = middle - 1;
            else
                low = middle +1;
        }

        return -1;
    }
}
