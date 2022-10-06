package Binar_Search;

public class LinearSrchString {

    public static void main(String[] abcd) {

        String[] arr = {"Ferdous", "Aarad", "Aqsa", "Silme"};
        String item = "Sumy";
        int temp =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(item)) {
                System.out.println("Item name is present in " + i+" position of the list");
                temp++;
            }
        }
        if (temp == 0){
            System.out.println("Item is not available in the list");
        }
    }
}