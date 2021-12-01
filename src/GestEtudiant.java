import java.util.Scanner;

public class GestEtudiant {

    public static void gestionEtudiant(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre l'effective de la salle");
        int NumEtudiant = scanner.nextInt();
        Etudiant Tab[] = new Etudiant [NumEtudiant];
        for(int i =0 ; i < NumEtudiant ; i++){
            Tab[i] = CreateEtudiant.createEtudiant();
        }

        Etudiant Tmp;
        for (int i =0 ; i < NumEtudiant-1 ; i++){
          for (int j = i+1 ; j < NumEtudiant ;  j++) {
                if (Tab[i].getMoyenne() > Tab[j].getMoyenne() ){
                    Tmp = Tab[i];
                    Tab[i] = Tab[j];
                    Tab[j] = Tmp ;
                }
          }
        }
        // Menu Principal
        for (int i =0 ; i < NumEtudiant ; i++){
            Tab[i].afficher();
        }
    }
}
