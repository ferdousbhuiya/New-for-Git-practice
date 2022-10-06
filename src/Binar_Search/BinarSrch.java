package Binar_Search;
/*Binary search is a searching method where it will search by
dividing the total array length. The array should be sorted array.
Sorted array means ascending order.
 */
public class BinarSrch {
    public static void main(String[] abc) {

        int[] a = {2, 5, 7, 9, 12, 14, 16, 17, 19, 20, 24, 28};
        int srch = 28;
        int li = 0;
        int hi = a.length - 1;
        int mi = (li + hi) / 2;

        while (li <= hi)
        {
            if (a[mi] == srch) {
                System.out.println("Element is present in position: " + mi + " index position");
                break;
            } else if (a[mi] < srch) {
                li = mi + 1;
            } else {
                hi = mi + 1;
            }
            mi = (li + mi) / 2;
        }
        if( li>hi){
            System.out.println("Element is not available in the list");
        }
    }
}