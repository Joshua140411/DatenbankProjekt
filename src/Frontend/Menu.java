package Frontend;

import Backend.*;
import Dtos.RuestungDto;
import java.util.Scanner;

public class Menu {

    private final RuestungService ruestungService;
    private final RuestungsTypService ruestungsTypService;
    private final NpcService npcService;
    private final VolkService volkService;
    private final GebietService gebietService;
    private final WaffeService waffeService;

    public Menu(RuestungService ruestungService, RuestungsTypService ruestungsTypService,
                NpcService npcService, VolkService volkService, GebietService gebietService,
                WaffeService waffeService) {
        this.ruestungService = ruestungService;
        this.ruestungsTypService = ruestungsTypService;
        this.npcService = npcService;
        this.volkService = volkService;
        this.gebietService = gebietService;
        this.waffeService = waffeService;
    }

    public void createMenu() {
        System.out.println("KONSOLENMENU");
        System.out.println("-----------------------------------");
        System.out.println("1 - SQL ABFRAGE 1");
        System.out.println("2 - SQL ABFRAGE 2");
        System.out.println("3 - SQL ABFRAGE 3");
        System.out.println("4 - SQL ABFRAGE 4");
        System.out.println("5 - SQL ABFRAGE 5");
        System.out.println("6 - CRUD BEISPIEL");
        System.out.println("7 - EXIT");

        manageInput(doInput());
    }

    public int doInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Bitte eine Zahl von 1-6 eingeben: ");
        return sc.nextInt();
    }

    public void manageInput(int eingabe) {
        Scanner sc2 = new Scanner(System.in);
        switch (eingabe) {
            case 1:
                System.out.println("SQL ABFRAGE 1");
                System.out.println();
                System.out.println("Voelker: ");
                volkService.getAllVolk().forEach(value -> System.out.println(value.toString()));
                System.out.println();
                System.out.println("Volk ID: ");
                int volkId = sc2.nextInt();
                System.out.println("--------------------------------");
                npcService.getAllNpcByVolkId(volkId).forEach(value -> System.out.println(value.allNpcByVolkIdToString()));
                System.out.println();
                createMenu();
                break;
            case 2:
                System.out.println("SQL ABFRAGE 2");
                System.out.println("--------------------------------");
                System.out.println();
                createMenu();
                break;
            case 3:
                System.out.println("SQL ABFRAGE 3");
                System.out.println("--------------------------------");
                System.out.println();
                gebietService.getAllGebietWithContinent("Eastern Kingdom").forEach(value -> System.out.println(value.gebietIdBezeichnungToString()));
                System.out.println();
                createMenu();
                break;
            case 4:
                System.out.println("SQL ABFRAGE 4");
                System.out.println("--------------------------------");
                System.out.println();
                volkService.getAllVolkByZugehoerigkeitWithHauptsitz("Horde").forEach(value -> System.out.println(value.volkWithHauptsitzbezeichnungToString()));
                System.out.println();
                createMenu();
                break;
            case 5:
                System.out.println("SQL ABFRAGE 5");
                System.out.println("--------------------------------");
                System.out.println();
                waffeService.getAll().forEach(value -> System.out.println(value.toString()));
                System.out.println();
                createMenu();
                break;
            case 6:
                System.out.println();
                crudMenu();
                createMenu();
                break;
            case 7:
                System.exit(0);
                break;
        }
    }

    public void crudMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("CRUD MENU");
        System.out.println("-----------------------------------");
        System.out.println("1 - CREATE");
        System.out.println("2 - READ");
        System.out.println("3 - READ ALL");
        System.out.println("4 - UPDATE");
        System.out.println("5 - DELETE");
        System.out.println("6 - BACK TO MAIN MENU");
        System.out.println("-----------------------------------");
        System.out.println("Bitte eine Zahl von 1-6 eingeben: ");
        int eingabe = sc.nextInt();
        switch (eingabe) {
            case 1:
                ruestungService.addRuestung(createDto(sc, 0));
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.print("READ");
                System.out.println("--------------------------------");
                System.out.print("ID: ");
                int typID = sc.nextInt();
                System.out.println();
                System.out.println(ruestungService.getRuestungById(typID).toString());
                System.out.println();
            case 3:
                System.out.println();
                System.out.print("READ ALL");
                System.out.println("---------------------------------");
                ruestungService.getAllRuestung().forEach(value -> System.out.println(value.toString()));
                System.out.println();
            case 4:
                System.out.println();
                System.out.print("UPDATE");
                System.out.println("-------------------------------");
                System.out.print("ID: ");
                int updateID = sc.nextInt();
                ruestungService.updateRuestung(createDto(sc, updateID));
                System.out.println();
            case 5:
                System.out.println();
                System.out.print("DELETE");
                System.out.println("-------------------------------");
                System.out.print("ID: ");
                int deletID = sc.nextInt();
                ruestungService.deleteRuestungById(deletID);
                System.out.println();
            case 6:
                break;
        }
    }

    public RuestungDto createDto(Scanner sc, int id) {
        int localId = 0;
        if(id == 0) {
            System.out.println();
            System.out.print("ID: ");
            localId = sc.nextInt();
        } else {
            localId = id;
        }
        System.out.print("Bezeichnung: ");
        String bezeichnung = sc.next();
        System.out.println();
        System.out.println("Liste aller Typen:");
        ruestungsTypService.getAllRuestungsTyp().forEach(value -> System.out.println(value.getRuestungstypID()));
        System.out.print("TypID: ");
        int typId = sc.nextInt();
        System.out.print("Item Level: ");
        int itemLevel = sc.nextInt();
        System.out.print("Mindestlevel: ");
        int mindestlevel = sc.nextInt();
        System.out.print("Ruestungspunkte: ");
        int ruestungspunkte = sc.nextInt();
        System.out.println();
        return new RuestungDto(localId, bezeichnung, typId, itemLevel, mindestlevel, ruestungspunkte);
    }
}