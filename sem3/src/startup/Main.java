package startup;

import controller.Controller;
import integration.RegistryCreator;
import integration.Printer;
import view.View;
import integration.ExternalAccountingSystem;
import integration.ExternalInventorySystem;


/**
 * Starts the entire application.
 */
public class Main {
    /**
     * @param args The program does not take any command line parameters. 
     */
    public static void main(String[] args) {
    	RegistryCreator regCreator = new RegistryCreator();
        Printer printer = new Printer();
        //
        ExternalInventorySystem  inventory = new ExternalInventorySystem();
        ExternalAccountingSystem accounting  = new ExternalAccountingSystem();
        Controller contr = new Controller(regCreator, printer, inventory, accounting);
        View view = new View(contr);
        view.sampleExecution();
    }
}
