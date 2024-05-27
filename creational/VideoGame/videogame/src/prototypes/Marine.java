package prototypes;

public class Marine extends RolePrototype {

    private String ship;

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public Marine() {
    }

    public Marine(Marine marine) {
        super(marine);
        this.ship = marine.ship;

    }

    @Override
    public RolePrototype clone() {
        return new Marine(this);
    }

}
