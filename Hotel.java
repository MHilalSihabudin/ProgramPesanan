import java.util.Scanner;

public class Hotel{
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Masukan pilihan: ");
        System.out.println("1. Lavana : 450.000");
        System.out.println("2. merapi : 568.000");
        System.out.println("3. King : 234.5000");
        System.out.println("4. matahari : 750.000");

        String kamar = data.nextLine();
        System.out.println("berapa malam anda menginap? (contoh : 2 hari)");
        int harga;
        int malam = data.nextInt();
        
        

        switch (kamar){
            case " Lavana":
            harga = 450000;
            break;

            case "merapi":
            harga = 568000;
            break;

            case "King":
            harga = 234500;
            break;

            case "matahari":
            harga = 750000;
            break;

            default:
            harga = 0;
            System.out.println("kamar tidak valid: ");
            break;
        }
            System.out.println("kamar yang dipilih:" + kamar);
            System.out.println("harga kamar:" + harga);
            System.out.println("selama:" + malam + " malam");
            System.out.println("Total harga: Rp." +harga*malam);
            System.out.println("---TERIMA KASIH---");
                  
    }
}
