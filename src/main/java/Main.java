import host.AIHost;
import host.Host;
import host.HumanHost;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.showMenu();
        Host host = new HumanHost();
        switch (menu.chosenGame()){
            case 1:
                host = new AIHost();
                break;
            case 2:
                host = new HumanHost();
                break;
            default:
                System.exit(1);
        }
        new HangedManEngine().start(host);

    }
}
