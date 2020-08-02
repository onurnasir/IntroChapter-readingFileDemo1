import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\ONUR\\Desktop\\JavaWorks\\readingFileDemo\\src\\sayilar.txt")); //Dosya okumak için javada bu methodu(foksiyon,operasyon) kullanıyoruz.
            // Bu yukardaki uzantıyı ya dosyaya girip ordan yada ide'nin solundaki sayilar.txt file formatına sağ tıklayıp copy den copy path. tıklayıpta ulaşabiliriz.
        } catch (FileNotFoundException e) { //Başta FileNotFoundException fırlatmayı yani hatayı fırlatmay
            e.printStackTrace();
        } finally {
            try {
                reader.close();

            } catch (Exception exception) {

            }
        }
    }
}