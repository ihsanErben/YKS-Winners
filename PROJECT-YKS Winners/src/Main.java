
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j = 1;
        while (j != 0) {
            System.out.println("0 - cikis");
            System.out.println("1 - YKS sayisal birincisi hesapla");
            System.out.println("2 - YKS sozel birincisi hesapla");
            System.out.print("secim: ");
            int secim = input.nextInt();
            if (secim == 0) {
                return;
            }
            System.out.println("");
            System.out.println("-------- ilk ogrenci bilgileri --------");
            System.out.print("name: ");
            String name1 = input.next();
            System.out.print("mat: ");
            int mat1 = input.nextInt();
            System.out.print("tr: ");
            int tr1 = input.nextInt();
            System.out.print("fen: ");
            int fen1 = input.nextInt();
            System.out.print("sos: ");
            int sos1 = input.nextInt();
            System.out.println("");
            System.out.println("-------- ikinci ogrenci bilgileri --------");
            System.out.print("name: ");
            String name2 = input.next();
            System.out.print("mat: ");
            int mat2 = input.nextInt();
            System.out.print("tr: ");
            int tr2 = input.nextInt();
            System.out.print("fen: ");
            int fen2 = input.nextInt();
            System.out.print("sos: ");
            int sos2 = input.nextInt();
            System.out.println("");
            
            Sayisal s1 = new Sayisal(name1, mat1, tr1, fen1, sos1);
            Sayisal s2 = new Sayisal(name2, mat2, tr2, fen2, sos2);

            Sozel s3 = new Sozel(name1, mat1, tr1, fen1, sos1);
            Sozel s4 = new Sozel(name2, mat2, tr2, fen2, sos2);
            switch (secim) {
                case 1:
                    Ogrenci birinci_sayisal = BirinciHesapla.birinci_ogrenci(s1, s2);
                    System.out.println("YKS sayisal birinci ogrenci bilgileri: ");
                    birinci_sayisal.info();
                    System.out.println("PUAN: " + birinci_sayisal.hesapla());
                    System.out.println("");
                    break;
                case 2:
                    Ogrenci birinci_sozel = BirinciHesapla.birinci_ogrenci(s3, s4);
                    System.out.println("YKS sozel birinci ogrenci bilgileri: ");
                    birinci_sozel.info();
                    System.out.println("PUAN: " + birinci_sozel.hesapla());
                    System.out.println("");
                    break;
            }

        }

    }
}
