import prototypes.RolePrototype;

public class Client {

    public void setRolType(RolePrototype prototype, String rolType) {
        prototype.setRoleType(rolType);
    }

    public RolePrototype createNewRole(RolePrototype prototype) {
        return prototype.clone();

    }

}
