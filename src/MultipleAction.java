import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MultipleAction {
    public static void main(String[] args) throws Exception {
        System.out.println("[INPUT] Masukan angka anda: ");
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String angkaInput = null;

        try {
            angkaInput = bfr.readLine();

            int Data = Integer.valueOf(angkaInput).intValue();
            if (Data > 10) {
                double DataKu = Data / 5.0;
                System.out.println("[OUTPUT] Data anda lebih dari 10, hasil bagi 5: " + DataKu);
            } else {
                int DataKu = Data * 5;
                System.out.println("[OUTPUT] Data anda kurang dari 10, hasil kali 5: " + DataKu);
            }
        } catch (NumberFormatException e) {
            System.out.println("[OUTPUT] Anda tidak memasukan angka!");
        } catch (Exception e) {
            System.out.println("[OUTPUT] Terjadi kesalahan!");
        }

    }
}
