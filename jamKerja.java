import java.util.Scanner;

public class jamKerja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean looping = true;
        int gaji = 0;
        int lembur = 0;
        int [] ArrUpah = {40000, 50000, 60000, 75000} ;
        
        while (looping == true){
            System.out.print("Nama Karyawan : ");
            String nama = input.next();
            System.out.print("Golongan : ");
            char golongan = input.next().charAt(0);

            System.out.print("Jam kerja dalam seminggu : ");
            int jamKerja = input.nextInt();
            if(jamKerja > 48){
                lembur = jamKerja - 48;
                jamKerja = jamKerja - lembur;
            }

            if(golongan == 'A' || golongan == 'a'){
                gaji = ArrUpah[0];
            }else if (golongan == 'B' || golongan == 'b'){
                gaji = ArrUpah[1];
            }else if (golongan == 'C' || golongan == 'c'){
                gaji = ArrUpah[2];
            }else if (golongan == 'D' || golongan == 'd'){
                gaji = ArrUpah[3];
            }
            else{
                System.out.println("Error");
            }
            lembur = lembur*30000;
            gaji = gaji * jamKerja;
            int total = gaji + lembur;
            System.out.print("\nNama : " + nama);
            System.out.print("\nGaji mingguan Rp " + gaji);
            System.out.print("\ngaji lembur Rp " + lembur);
            System.out.print("\nTotal gaji mingguan Rp " + total);

            System.out.print("\n\ningin coba lagi (y/n) ? ");
            char coba = input.next().charAt(0);
            if(coba == 'N' || coba == 'n'){
                looping = false;
                System.out.println("Terima Kasih ");
            }
        }
    }
}
