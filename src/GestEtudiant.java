import java.util.Scanner;

public class GestEtudiant {

    public static void gestionEtudiant() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre l'effective de la salle");
        int NumEtudiant = scanner.nextInt();
        Etudiant Tab[] = new Etudiant[NumEtudiant];
        for (int i = 0; i < NumEtudiant; i++) {
            Tab[i] = CreateEtudiant.createEtudiant();
        }

        Etudiant Tmp;
        for (int i = 0; i < NumEtudiant - 1; i++) {
            for (int j = i + 1; j < NumEtudiant; j++) {
                if (Tab[i].getMoyenne() > Tab[j].getMoyenne()) {
                    Tmp = Tab[i];
                    Tab[i] = Tab[j];
                    Tab[j] = Tmp;
                }
            }
        }
        // Menu Principal


            menu :
            System.out.println("\n ------ MENU DE GESTION D'ETUDIANT ------ \n");
            System.out.println(" 1. Afficher les information des etudiant \n");
            System.out.println(" 2. Afficher l'information du premiere etudiant \n");
            System.out.println(" 3. Afficher l'information du dernier etudiant \n");
            System.out.println(" 4. Reinitialiser la liste de la classe \n");
            System.out.println(" 5. Sortir du programme \n");

            System.out.println("Votre choix : ");
            int choice = scanner.nextInt();


            switch (choice) {
                case 1:
                    for (int i = 0; i < NumEtudiant; i++) {
                        Tab[i].afficher();
                    }
                    break;
                case 2:
                    Tab[0].afficher();
                    break;
                case 3:
                    Tab[NumEtudiant - 1].afficher();
                    break;
                case 4:
                    char choix = 'A';
                    System.out.println("voulez vous reinitialiser la liste ? \n o(oui) ... \n n(non) ");
                    choix = scanner.nextLine().charAt(0);
                    if (choix == 'n') {
                        System.out.println("Merci votre demande d'annulation a ete fait");
                        break;
                    }
                    if (choix == 'o') {
                        break;
                    }
                case 5:
                    System.out.println("Fin du programme");
                    break;
            }
        }
}
