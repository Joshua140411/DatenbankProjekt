import Backend.RuestungService;
import Daos.RuestungDao;
import Frontend.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu(new RuestungService(new RuestungDao()));
        menu.createMenu();
    }
}