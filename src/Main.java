import Backend.NpcService;
import Backend.RuestungService;
import Backend.RuestungsTypService;
import Backend.VolkService;
import Daos.NpcDao;
import Daos.RuestungDao;
import Daos.RuestungsTypDao;
import Daos.VolkDao;
import Frontend.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu(new RuestungService(new RuestungDao()), new RuestungsTypService(new RuestungsTypDao()), new NpcService(new NpcDao()), new VolkService(new VolkDao()));
        menu.createMenu();
    }
}