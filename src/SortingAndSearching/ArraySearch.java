package SortingAndSearching;

import java.util.Vector;

public class ArraySearch {
    int hasil;
    boolean ketemu = false;
    private Vector<Integer> vectorArs;

    public boolean Search(int cari) {
        new Data();
        int batas = Data.getUkuranVector();
        vectorArs = new Vector<Integer>(batas);
        vectorArs.addAll(Data.getVector());

        int[] ArySearch = new int[batas];
        for (int i = 0; i < batas; i++) {
            ArySearch[i] = vectorArs.get(i);
        }
        int index = 0;
        int value;

        while ((!ketemu) && (cari <= ArySearch[index]) && (index < batas)) {
            value = ArySearch[index];
            if (cari == value) {
                ketemu = true;
                hasil = index;
            } else {
                index++;
            }
        }
        return ketemu;
    }

    public int getHasil() {
        return hasil + 1;
    }
}
