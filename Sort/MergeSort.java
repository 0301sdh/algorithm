package Sort;

public class MergeSort {
    
    public static void mergeSort(int[] A,int p,int r){
        if(p<r){
            int q = (p+r)/2;
            mergeSort(A, p, q);
            mergeSort(A, q+1, r);
            merge(A,p,q,r);
        }
    }

    public static void merge(int[] A, int p, int q, int r){
        int i = p;
        int j = q+1;
        int k = p;
        int[] tmp = new int[A.length];
        while(i<=q && j<=r){
            if(A[i]<=A[j]){
                tmp[k++] =A[i++];
            }
            else{
                tmp[k++] = A[j++];
            }
        }
        while(i<=q){
            tmp[k++] =A[i++];
        }
        while (j<=r) {
             tmp[k++] =A[j++];
        }
        for(int g = p; g<=r; g++){
            A[g] = tmp[g];
        }
    }
}
