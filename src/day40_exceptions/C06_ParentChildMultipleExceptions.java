package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C06_ParentChildMultipleExceptions {

    public static void main(String[] args) throws IOException {


        // Notlar.txt dosyasindaki notlari yazdiralim

        String dosyaYolu = "src/day40_exceptions/Notlar.txt";

        // Notlar dosyasini yazdirabilmek icin once Javanin o dosyaya ulasmasi lazim

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        // Unhandled exception: java.io.FileNotFoundException

        int k='a';

        while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
            // Unhandled exception: java.io.IOException
            System.out.print((char) k);
        }

    }
}
