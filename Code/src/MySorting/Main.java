package MySorting;

import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {
        int n = 5;
        int[] a = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(n);
        }
        System.out.println("Before sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        Sorting s = new Sorting();
//        s.selection(a, n);
     long start = System.currentTimeMillis();
//        s.insertion(a, n);
        s.quicksort(a, 0, n-1);
//     s.mergesort(a, 0, n-1);
     long end = System.currentTimeMillis();
     System.out.println("Time consuming: " + (end - start) / 1000.0);
     s.save(a, n);
        System.out.println("After sort: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
}
