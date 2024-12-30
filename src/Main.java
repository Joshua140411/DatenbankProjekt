import Backend.RuestungService;
import Backend.RuestungsTypService;
import Daos.RuestungDao;
import Daos.RuestungsTypDao;
import Frontend.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu(new RuestungService(new RuestungDao()), new RuestungsTypService(new RuestungsTypDao()));
        menu.createMenu();
    }
}