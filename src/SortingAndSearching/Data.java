package SortingAndSearching;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Vector;

public class Data {
    private static int ukuranVector;
    private static Vector<Integer> vector;

    public static void main(String[] args) {
        System.out.println("Berapa ukuran vector yang Anda mau? ");
        ukuranVector = getInputData();
        createVector();
        readData();
        getPengurutan();
        writeData();

        System.out.println("Apakah Anda mau melakukan pencarian?");
        System.out.println("Jika ya, masukan anda akan dicari. Jika tidak ketik -99.");

        int cari = getInputData();
        if (cari != -99) {
            searchData();
        } else {
            System.out.println("Anda tidak melakukan pencarian.");
        }
    }

    public static void searchData() {
        System.out.println("Metode pencarian apa yang akan digunakan? ");

        System.out.println("1. Array Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Vector Search");

        int pilihan = getInputData();
    }

    private static int getInputData() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        try {
            input = bfr.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int data = Integer.valueOf(input).intValue();
        return data;
    }

    private static void getPengurutan() {
        System.out.println("Metode pengurutan apa yang akan digunakan? ");

        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.println("4. Shell Sort");
        System.out.println("5. Quick Sort");

        int pilihan = getInputData();
        if (pilihan == 1) {
            vector.addAll(BubbleSort.Sort(vector));
        }
    }

    private static void createVector() {
        vector = new Vector<Integer>(ukuranVector);
    }

    private static void readData() {
        int data;
        for (int i = 0; i < ukuranVector; i++) {
            System.out.println("Masukan data ke-" + (i + 1) + ": ");
            data = getInputData();
            vector.add(data);
        }
    }

    private static void writeData() {
        System.out.println("\nData yang Anda diurutkan: ");
        for (int i = 0; i < ukuranVector; i++) {
            System.out.println("Data ke " + (i + 1) + ": " + vector.get(i));
        }
    }

    public static int getUkuranVector() {
        return ukuranVector;
    }

    public static Vector<Integer> getVector() {
        return vector;
    }
}