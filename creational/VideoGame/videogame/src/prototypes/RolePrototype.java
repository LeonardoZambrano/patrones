package prototypes;

public abstract class RolePrototype {

    protected String roleType;

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public RolePrototype() {
    }

    public RolePrototype(RolePrototype rolePrototype) {
        this.roleType = rolePrototype.roleType;

    }

    public abstract RolePrototype clone();

}
