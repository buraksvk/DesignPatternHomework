import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main
{
   public static void main(String[] args)throws Exception 
   {
        //input.txt'den sorumlunun girdiği input çekildi.
        Scanner input = new Scanner(new File("input.txt"));
        String booktype = input.next();
        
        //subject nesnesi oluşturuldu
        Subject subjct = new Subject();
    
        //UpdateObserver çağırıldı
        new UpdateBookObserver(subjct);

        //Burada Yeni Bir BookFactory nesnesi oluşturuldu.
        BookFactory bookFactory = new BookFactory();
        //Nesne oluşturulup getBook çağırıldı.
        Books book1 = bookFactory.getBook(booktype);
        //choice fonksiyonu çalıştırıldı.
        book1.choice();
        
        //subject nesnesinin içine stoğun değiştirileceği booktype atıldı.
        subjct.setStateBook(booktype);
   }
}

