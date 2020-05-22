public class BookFactory 
{
   //Kitap nesnesini almak için getBook uygulandı.
   public Books getBook(String bookType){
      if(bookType == null)
      {
         return null;
      }		
      if(bookType.equalsIgnoreCase("HISTORY"))
      {
         return new HistoryBook();
      } 
      else if(bookType.equalsIgnoreCase("STORY"))
      {
         return new StoryBook();
      } 
      else if(bookType.equalsIgnoreCase("NOVEL"))
      {
         return new NovelBook();
      }
      return null;
   }
}