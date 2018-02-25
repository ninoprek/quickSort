/**
 * QuickSort
 */ 
import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    public void quickSort(int[] a, int low, int high) {
        if (low < high - 1) {
            int p = partition(A, low, high);
            quickSort(a, low, p-1);
            quickSort(a, p+1, high);
        }
    }

    public void swap(int[] a, int i, int j) {
        int tmp = A[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private int getPivot (int low, int high) {
        Random rnd = new Random();
        return rand.nextInt((high - low) + 1) + low;
    }

    private int partition (int[] a, int low, int high) {
        
    }

    public static void main(String[] args) {
        
    }
    
}