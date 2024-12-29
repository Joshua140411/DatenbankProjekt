package Frontend;

import Backend.RuestungService;

import java.util.Scanner;

public class Menu {

    private RuestungService ruestungService;

    public Menu(RuestungService ruestungService) {
        this.ruestungService = ruestungService;
    }

    public void createMenu() {
        System.out.println("DAS IST DAS MENU");
        System.out.println("-----------------------------------");
        System.out.println("1 - SQL ABFRAGE 1");
        System.out.println("2 - SQL ABFRAGE 2");
        System.out.println("3 - SQL ABFRAGE 3");
        System.out.println("4 - SQL ABFRAGE 4");
        System.out.println("5 - SQL ABFRAGE 5");
        System.out.println("6 - EXIT");

        manageInput(doInput());
    }

    public int doInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Bitte eine Zahl von 1-6 eingeben: ");
        return sc.nextInt();
    }

    public void manageInput(int eingabe) {

        while(eingabe > 0 && eingabe < 6) {
            switch (eingabe) {
                case 1:
                    System.out.println("SQL ABFRAGE 1");
                    System.out.println("");
                    createMenu();
                    break;

                case 2:
                    System.out.println("SQL ABFRAGE 2");
                    System.out.println("");
                    createMenu();
                    break;

                case 3:
                    System.out.println("SQL ABFRAGE 3");
                    System.out.println("");
                    createMenu();
                    break;

                case 4:
                    System.out.println("SQL ABFRAGE 4");
                    System.out.println("");
                    createMenu();
                    break;

                case 5:
                   ruestungService.getAllRuestung().forEach(value->System.out.println(value.getRuestungsId()));
                    createMenu();
                    break;
            }
        }
        if(eingabe == 6) {
            System.exit(0);
        }
    }
}