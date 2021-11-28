import java.util.Scanner;

public class GestEtudiant {

    public static void gestionEtudiant(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre l'effective de la salle");
        int NumEtudiant = scanner.nextInt();
        Etudiant Tab[] = new Etudiant [NumEtudiant];
        for(int i =0 ; i < NumEtudiant ; i++){
            Tab[i] = Etudiant.createEtudiant();
        }
        for (int i =0 ; i < NumEtudiant ; i++){
           Tab[i].afficher();
        }
    }
}
