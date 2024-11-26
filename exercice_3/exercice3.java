public class StockManager {

    /**
     * Gere le stock
     * 
     * @param typeOperation
     *          Définit le type de l'opération
     * @param produit
     *          Le nom du produit
     * @param quantite
     *          La quantite du produit
     * @param stock
     *          Le nombre qu'on a de ce produit en stock
     */
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        switch(typeOperation) {
            case "ajout" :
                stock = ajoutStock(stock, quantite);
                break;
            case "retrait" : 
                retraitStock(stock, quantite)
                break;
            default :   // Si l'action est inconnu
                System.out.println("Opération inconnue.");
                break;
        }
    }

    /**
     * Ajoute au stock la quantite du produit actuel
     * 
     * @param stock
     *          Le nombre qu'on a d'un produit en stock
     * @param quantite
     *          La quantite du produit envoyé
     * 
     * @return le stock avec la quantite supplémentaire du produit rajouter
     */
    public int ajoutStock(int stock, int quantite) {
        //Ajout au stock
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);

        return stock;
    }

    /**
     * Retire du stock la quantite du produit actuel
     * 
     * @param stock
     *          Le nombre qu'on a d'un produit en stock
     * @param quantite
     *          La quantite du produit envoyé
     * 
     * @return le stock avec la quantite supplémentaire du produit enlever
     */
    public int retraitStock(int stock, int quantite) {
        //Retrait du stock
        if (stock >= quantite) {
            stock -= quantite;
            System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        } else {
            System.out.println("Stock insuffisant pour le produit : " + produit);
        }

        return stock;
    }
}