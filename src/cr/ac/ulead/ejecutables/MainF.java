package cr.ac.ulead.ejecutables;
import cr.ac.ulead.logica.Logic;
import cr.ac.ulead.ui.UIUtils;

public class MainF {
   public static void main(String[] args) throws Exception {
       ejecutar();
   }
    private static void ejecutar() throws Exception {
        Logic logic = new Logic();
        int option = 5;
        do {
            logic.execute(option);
        } while (option != 6);
    }
}



