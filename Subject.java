import java.util.ArrayList;
import java.util.List;

public class Subject {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private String state;

   public String getStateBook() {
      return state;
   }

   public void setStateBook(String state) {
      this.state = state;
      notificationObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

   public void notificationObservers(){
      for (Observer observer : observers) {
         observer.updateBook();
      }
   } 	
}