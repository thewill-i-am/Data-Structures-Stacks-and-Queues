package cr.ac.ulead.ejecutables;
import cr.ac.ulead.logica.Logic;

public class MainA {
   public static void main(String[] args)  {
       ejecutar();
   }
    private static void ejecutar()  {
        Logic logic = new Logic();
        int option = 1;
        do {
            logic.execute(option);
        } while (option != 6);
    }
}



