public class GestionnaireNotes {

    /**
     * Affiche note et moyennes
     * 
     * @param nomEtudiant
     *          Contient le nom de l'étudiant
     * @param notes
     *          Contient toutes les notes de l'étudiant
     */
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        int somme = calculSomme(notes);

        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }

        // Affichage de la moyenne
        double moyenne = (double) somme / notes.length;
        System.out.println("Moyenne : " + moyenne);
    }

    /**
     * Calcule la somme des notes
     * 
     * @param notes
     *          Contient toutes les notes de l'étudiant
     * 
     * @return la somme des notes
     */
    public void calculSomme(int[] notes) {
        // Calcul de la somme des notes
        int somme = 0;

        for (int note : notes) {
            somme += note;
        }

        return somme;
    }
}
