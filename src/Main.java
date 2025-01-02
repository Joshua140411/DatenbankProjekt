import Backend.*;
import Daos.*;
import Frontend.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu(new RuestungService(new RuestungDao()),
                new RuestungsTypService(new RuestungsTypDao()),
                new NpcService(new NpcDao()),
                new VolkService(new VolkDao()),
                new GebietService(new GebietDao()),
                new WaffeService(new WaffeDao()));
        menu.createMenu();
    }
}