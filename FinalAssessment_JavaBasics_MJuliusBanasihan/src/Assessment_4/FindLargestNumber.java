package Assessment_4;

/**
 * Created by MXB2320 on 5/22/2017.
 */
public class FindLargestNumber {
    public static void main(String[] args) {
        int[] largeArray = {2,5,9,10,20,30,40,55,68,99};
        System.out.println(findLargest(largeArray));
    }

    public static int findLargest (int array[]){
        int largest = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > largest)largest = array[i];
        }
        return largest;
    }
}
