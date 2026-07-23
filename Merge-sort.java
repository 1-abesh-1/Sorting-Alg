public class Main{
    public static void main(String [] args){

        int arr[]= {10,10,1,5,7,9,8,12,13,15,14};
        merge_sort(arr, 0, arr.length- 1);
        for(int i=0;i<arr.length;i++){
            System.out.print("| "+arr[i]+" |");
        }
    }

public static void merge(int arr[],int left,  int mid, int right){
int n1=mid-left+1;
int n2=right-mid;

int[] l=new int[n1];
int[] r=new int[n2];


 for(int i=0;i<n1;i++){
        l[i] = arr[left + i];
 }
 for(int j=0;j<n2;j++){
        r[j] = arr[mid + 1 + j];
}

int i=0;
int j=0;
int k=left;

 while (i < n1 && j < n2) {
        if (l[i] <= r[j]){
            arr[k] = l[i];
            i++;
        }
        else{
            arr[k] = r[j];
            j++;
        }
        k++;
    }

    while (i < n1){
        arr[k]=l[i];
        i++;
        k++;
    }
    while (j < n2){
        arr[k] = r[j];
        j++;
        k++;
    }

}

    // worst case time complexity is O(nlog(n))
    public static void merge_sort(int arr[], int left, int right){
 if (left < right) {
        int mid = left + (right - left) / 2;

        merge_sort(arr, left, mid);
        merge_sort(arr, mid + 1, right);

        merge(arr, left, mid, right);
    }
}





    
}
