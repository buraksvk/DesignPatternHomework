public class UpdateBookObserver extends Observer
{

   public UpdateBookObserver(Subject subjct)
   {
      this.subjct = subjct;
      this.subjct.attach(this);
   }
   @Override
   public void updateBook() {
      System.out.println( "Değiştirilmiş Stok :" +  subjct.getStateBook()); 
   }
}