import prototypes.RolePrototype;
import prototypes.Sniper;

public class App {
    public static void main(String[] args) throws Exception {
        RolePrototype sniper = new Sniper();
        Client client = new Client();
        client.setRolType(sniper, "sniper1");

        RolePrototype sniper2 = client.createNewRole(sniper);

        /* initial objects */

        System.out.println("(1)rol 1: " + sniper.getRoleType());
        System.out.println("(1)rol 2: " + sniper2.getRoleType());

        /* Modificated copy */

        client.setRolType(sniper2, "sniper2");

        System.out.println("(2)rol 1: " + sniper.getRoleType());
        System.out.println("(2)rol 2: " + sniper2.getRoleType());

    }
}
