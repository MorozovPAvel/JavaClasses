import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        String[] str = {"b","a","c","z","r","f"};
        int[] arr = {8,3,1,4,2,6,5,7,19,0,14,3,6,4,5,6,8,9,20,57,12,313,14,43,234,4};

        long l = arr.length;
        System.out.println(l);
        viborom(arr);
            System.out.println();
        arrSort(arr);
            System.out.println();
        sorterNew(arr);
            System.out.println();
        sortirovka(arr);
    }

    public static void viborom(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < min){
                    min=arr[j];
                    min_i=j;
                }
            }
            if(i != min_i){
                int count = arr[i];
                arr[i]=arr[min_i];
                arr[min_i] = count;
            }
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    static void arrSort(int[]arr){
        Arrays.sort(arr);

        for(int x : arr){
            System.out.print(x + " ");
        }
    }
    static void sorterNew(int[]arr){
        boolean trigger = true;
        while(trigger) {
            trigger = false;
            for (int i = 0; i < arr.length - 1; i++) {
                int tmp;
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    trigger = true;

                }
            }
        }
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    static void sortirovka(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) { //int j = arr.length -1; j < 0; j++
                int tmp;
                if(arr[i]<arr[j]){
                    tmp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
