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
        System.out.println("1 - CREATE");
        System.out.println("2 - READ");
        System.out.println("3 - UPDATE");
        System.out.println("4 - DELETE");
        System.out.println("5 - EXIT");
        System.out.println("6 - Test");

        manageInput();
    }

    public void manageInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("Bitte eine Zahl von 1-6 eingeben: ");
        int eingabe = sc.nextInt();
        switch (eingabe) {
            case 1:
                //TODO
                break;

            case 2:
                //TODO
                break;

            case 3:
                //TODO
                break;

            case 4:
                //TODO
                break;

            case 5:
                System.exit(0);
                break;

            case 6:
                ruestungService.getAllRuestung().forEach(System.out::println);
                break;
        }
    }
}