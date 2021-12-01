import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CreateEtudiant {
    public static Etudiant createEtudiant(){
        Scanner scanner = new Scanner(System.in);

        String nomEtudiant = "";
        while (nomEtudiant.length() < 3){
            System.out.println("Quelle est le nom de l'étudiant");
            nomEtudiant = scanner.nextLine();
        }



        String matriculeEtudiant = "";
        while (matriculeEtudiant.length() != 7){
            System.out.println("Quelle est le matricule de l'étudiant");
            matriculeEtudiant = scanner.nextLine();
        }

        char genreEtudiant = 'A';
        boolean goodGenre = false;
        while (!goodGenre){
            System.out.println("Quelle est le genre de l'étudiant");
            genreEtudiant = scanner.nextLine().charAt(0);
            if(genreEtudiant == 'M')
                goodGenre = true;
            if(genreEtudiant == 'F')
                goodGenre = true;
        }
        double moyenne;
        do {
            System.out.println("Quelle est la moyenne de l'étudiant sur 20");
            moyenne = scanner.nextInt();
        }
        while (moyenne < 0 && moyenne < 20);

        Date date = null;
        boolean goodDate = false;
        while (!goodDate){
            System.out.println("Quelle est la date de naissance d el'étudiant: format dd/MM/yyyy");
            String dateInString = scanner.nextLine();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            try{
                date= formatter.parse(dateInString);
                goodDate = true;
            }catch (Exception e){

            }
        }


        return new Etudiant(matriculeEtudiant,nomEtudiant,genreEtudiant,date,moyenne);

    }

}

