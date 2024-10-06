package DosyaAkislari;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Driver {
    public static void main(String[] args) {
        //dosyadan okuma
        File file = new File("hello.txt");
        FileInputStream fileInputStream = null  ;
        try {
            fileInputStream = new FileInputStream(file);
            int c = 0 ;
            while( (c = fileInputStream.read()) != -1){
                System.out.print((char) c);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

      /*

      // dosya oluşturma:

       //FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("merhaba".getBytes());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    */

}

