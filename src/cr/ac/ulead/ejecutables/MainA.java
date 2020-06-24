package cr.ac.ulead.ejecutables;
import cr.ac.ulead.logica.Logic;

public class MainA {
   public static void main(String[] args) throws Exception {
       ejecutar();
   }
    private static void ejecutar() throws Exception {
        Logic logic = new Logic();
        int option = 1;
        do {
            logic.execute(option);
        } while (option != 6);
    }
}



