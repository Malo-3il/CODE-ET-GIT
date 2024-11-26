public class FactureManager {

    /**
   * Calcul le total d'une facture
   *
   * @param typeProduit
   *            le type du produit
   * @param quantite
   *            la quantite du produit
   * @param prixUnitaire
   *            le prix unitaire du produit
   * 
   * @return total à payer client
   */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        total = reduceTypeProduct(typeProduit, total);

        // Reduction sur le total
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }

    /**
    * Applique une réduction en fonction du type de produit
    *
    * @param typeProduit
    *            le type du produit
    * @param total
    *            la somme total que le client va payer
    * 
    * @return total avec reduction type
    */
    public double reduceTypeProduct(String typeProduit, double total) {
        switch(typeProduit) {
            case "Alimentaire" :
                total -= total * 0.05; // Réduction de 5%
                break;
            case "Electronique" :
                total -= total * 0.1; // Réduction de 10%
                break;
            case "Luxe" :
                total -= total * 0.15; // Réduction de 15%
        
        return total;
    }
}
