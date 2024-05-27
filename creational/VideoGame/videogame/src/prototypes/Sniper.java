package prototypes;

public class Sniper extends RolePrototype {

    private String scope;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public Sniper() {
    }

    public Sniper(Sniper sniper) {
        super(sniper);
        this.scope = sniper.scope;

    }

    @Override
    public RolePrototype clone() {
        return new Sniper(this);
    }

}
