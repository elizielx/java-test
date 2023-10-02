package SortingAndSearching;

import java.util.Vector;

public class BubbleSort {
    public static Vector<Integer> Sort(Vector<Integer> vector) {
        int n = 0;
        int ukuran = vector.size();

        while (n < ukuran) {
            for (int i = 1; i < ukuran; i++) {
                if (vector.get(i - 1) > vector.get(i)) {
                    int temp = vector.get(i - 1);
                    vector.set(i - 1, vector.get(i));
                    vector.set(i, temp);
                }
            }
            n++;
        }

        return vector;
    }
}
