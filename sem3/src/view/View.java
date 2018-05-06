package view;

import controller.Controller;

/**
 * This is a placeholder for the view. It contains only hardcoded calls to the controller.
 */
public class View {
    private Controller contr;
    
    /**
     * Constructs a new view, using the specified controller.
     * 
     * @param contr This controller will be used for all system operations.
     */
    public View(Controller contr) {
        this.contr = contr;
    }
    
    /**
     * Simulates a sample execution containing calls to all system operations.
     * customer wants to buy, four pepsi, three cinnamon rolls, and 2 cup of tee, the cutomer has 500kr in cash and expects change.
     */
    public void sampleExecution() {
        System.out.println("Starting sample execution.");
        contr.startSale();
        System.out.println("After call to startSale()");
        System.out.println(contr.enterItemIDAndQuantity("PS", 4));
        System.out.println(contr.enterItemIDAndQuantity("KB", 2));
        System.out.println(contr.enterItemIDAndQuantity("TE", 3));
        System.out.println(contr.enterItemID("KB"));
        System.out.println(contr.enterItemID("TE"));
        System.out.println(contr.indicateAllItemsRegistered());
        System.out.println(contr.enterPaidCash(500));
               
        
    }
}
