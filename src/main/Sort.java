package main;

public class Sort {
    public static void quickSort(int a[], int low, int high) {
        //请实现本方法
        if(low>=high)return;
        int i=low;
        int j=high;
        while (i<j){
            while (a[j]>=a[low]&&j>i) {
                j--;
            }
            while (a[i]<=a[low]&&i<j){
                i++;
            }
            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        int temp=a[low];
        a[low]=a[i];
        a[i]=temp;
        quickSort(a,low,i-1);
        quickSort(a,i+1,high);
    }

        public static void main(String[] args) {
            int a[] = { 46, 58, 15, 45, 90, 18, 10, 62, 46 };
            System.out.println("Before Sorting:");
            for (int i = 0; i < a.length; i++){
                System.out.print(a[i] + " ");
            }
            System.out.println();
            System.out.println("After Sorting:");
            quickSort(a,0,8);
            for (int i = 0; i < a.length; i++){
                System.out.print(a[i] + " ");
            }
//            for (int j=0;j<a.length;j++){
//                for(int k=0;k<a.length-1;k++){
//                    if(a[k]<a[k+1]){
//                        int temp=a[k];
//                        a[k]=a[k+1];
//                        a[k+1]=temp;
//                    }
//                }
//            }
//            for (int i = 0; i < a.length; i++){
//                System.out.print(a[i] + " ");
//            }
        }

}
