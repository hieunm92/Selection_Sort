public class SelectionSort {
    static int[] list = {5,8,3,4,9,1,7,2};
    public static void selectionSort (int [] list){
        for (int i = 0; i < list.length-1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i+1; j < list.length; j++) {
                if (currentMin > list[j]){
                    currentMin = list[j];
                    currentMinIndex = j;
                }

            }
            if (currentMinIndex != i){
                list[currentMinIndex]=list[i];
                list[i]=currentMin;

            }

        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");

        }
    }
}
