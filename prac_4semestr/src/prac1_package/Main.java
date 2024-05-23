package  prac1_package;

public class Main implements Consumer {
    @Override
    public void sorting(int[] arr) {
        for (int i = arr.length - 1; i >= 1; i--){
            for (int j = 0; j < i; j++){
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
    @Override
    public void arr_print(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
