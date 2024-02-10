package apprenant;

import java.util.ArrayList;
import java.util.Scanner;

public class Apprenant {
    private String nom;
    private String prenom;
    private int date_de_naissance;
    private String adresse;
    private int numero_telephone;
    private int numero_classe;
    //public Apprenant(){
                /*this.nom = nom;
                this.prenom = prenom;
                this.date_de_nessance = date_de_nessance;
                this.adresse = adresse;
                this.numero_telephone = numero_telephone;
                this.numero_classe = numero_classe;*/
    //}

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getDate_de_naissance() {
        return date_de_naissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public int getNumero_telephone() {
        return numero_telephone;
    }

    public int getNumero_classe() {
        return numero_classe;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDate_de_naissance(int date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumero_telephone(int numero_telephone) {
        this.numero_telephone = numero_telephone;
    }

    public void setNumero_classe(int numero_classe) {
        this.numero_classe = numero_classe;
    }

    public void Ajouter(ArrayList<Apprenant> apprenants){
        Apprenant A = new Apprenant(); //Creation d'un Objet A
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer le nom du apprenant :");
        A.nom = scanner.nextLine();
        System.out.println("Entrer le prenom du apprenant :");
        A.prenom = scanner.nextLine();
        System.out.println("Entrer l'adresse :");
        A.adresse = scanner.nextLine();
        System.out.println("Entrer la date de naissance :");
        A.date_de_naissance = scanner.nextInt();
        System.out.println("Entrer le numero de telephone du apprenant :");
        A.numero_telephone= scanner.nextInt();
        System.out.println("Entrer le numero de la classe du apprenant :");
        A.numero_classe= scanner.nextInt();

        apprenants.add(A);
    }
    public void Consulter(Apprenant apprenant) {
        System.out.println("Nom de l'apprenant : " + apprenant.getNom());
        System.out.println("Prenom de l'apprenant : " + apprenant.getPrenom());
        System.out.println("Date de naissance : " + apprenant.getDate_de_naissance());
        System.out.println("Adresse : " + apprenant.getAdresse());
        System.out.println("Numéro de téléphone de l'apprenant : " + apprenant.getNumero_telephone());
        System.out.println("Numéro de la classe de l'apprenant : " + apprenant.getNumero_classe());
    }
    public void Modifier(ArrayList<Apprenant> apprenants){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel apprenant souhaitez-vous modifier ?");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        if (choice >= 0 && choice < apprenants.size()) {
            Apprenant A = apprenants.get(choice);

            System.out.println("Quel attribut souhaitez-vous modifier ?");
            System.out.println("1. Nom");
            System.out.println("2. Prenom");
            System.out.println("3. Adresse");
            System.out.println("4. Date de naissance");
            System.out.println("5. Numero de telephone");
            System.out.println("6. Numero de classe");

            int attributeChoice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (attributeChoice) {
                case 1:
                    System.out.println("Entrer le nouveau nom de cet apprenant :");
                    A.setNom(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Entrer le nouveau prenom de cet apprenant :");
                    A.setPrenom(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Entrer la nouvelle adresse :");
                    A.setAdresse(scanner.nextLine());
                    break;
                case 4:
                    System.out.println("Entrer la nouvelle date de naissance :");
                    A.setDate_de_naissance(Integer.parseInt(scanner.nextLine()));
                    break;
                case 5:
                    System.out.println("Entrer le nouveau numero de telephone de cet apprenant :");
                    A.setNumero_telephone(Integer.parseInt(scanner.nextLine()));
                    break;
                case 6:
                    System.out.println("Entrer le nouveau numero de la classe de cet apprenant :");
                    A.setNumero_classe(Integer.parseInt(scanner.nextLine()));
                    break;
                default:
                    System.out.println("Choix invalide");
                    break;
            }
        } else {
            System.out.println("Index d'apprenant invalide.");
        }
    }

}
