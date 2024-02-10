import apprenant.Apprenant;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static Apprenant apprenant1 = new Apprenant();
    static ArrayList<Apprenant> apprenants = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;
        do {
            System.out.printf("-------------MENU-----------\n");
            System.out.printf("---------1 - Ajouter un nouvel apprenant--------\n");
            System.out.printf("---------2 - Modifier les informations d'un apprenant existant-------\n");
            System.out.printf("---------3 - Supprimer un apprenant existant-------\n");
            System.out.printf("---------4 - Consulter la liste des apprenants-------\n");
            System.out.printf("---------5 - Rechercher un apprenant ------\n");
            System.out.printf("---------6 - Quitter-------\n");
            System.out.printf("==  Ecrit votre choix ici  ==\n");
            choix = scanner.nextInt();
            switch (choix){
                case 1 :
                    //AJOUTER
                    apprenant1.Ajouter(apprenants);
                    break;
                case 2:
                    //MODIFIER
                    apprenant1.Modifier(apprenants);
                    break;
                case 3 :
                    //SUPPRIMER

                    break;
                case 4:
                    //CONSULTER
                    Scanner input = new Scanner(System.in);
                    System.out.println("Enter the index of the student to consult: ");
                    int index = input.nextInt();
                    if (index >= 0 && index < apprenants.size()) {
                        Apprenant studentToConsult = apprenants.get(index);
                        apprenant1.Consulter(studentToConsult);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 5 :
                    //RECHERCHER

                    break;
                case 6 :
                    //QUITTER LE PROGRAMME
                    System.out.printf("Au revoir !\n");
                    break;
            }
        }while(choix != 6);
    }
}
