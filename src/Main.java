import apprenant.Apprenant;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
    public class Main {
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

                    break;
                case 2 :

                    break;
                case 3 :

                    break;
                case 4 :

                    break;
                case 5 :

                    break;
                case 6 :
                    System.out.printf("Au revoir !\n");
                    break;
            }
        }while(choix != 6);
    }
}