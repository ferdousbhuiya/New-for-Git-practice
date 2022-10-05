package Binar_Search;
// This is linear search because, it will search one by one element from 0 index to the last index.
//it will search linearly.
public class LinearSrchInteger {

    public static void main(String [] args){

        int [] arr = {5, 3, 6, 1, 4,2};
        int item =1;
        int temp =0;
        for (int i=0; i<arr.length; i++){

            if (arr[i] == item){
                System.out.println(" item is present at "+ i + " index position");
                temp++;
            }

        }
        if(temp==0){
            System.out.println("Item not found in list");
        }
    }
}
