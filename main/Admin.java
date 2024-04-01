import java.util.Date;


public class Admin extends User implements AdminUser {
    private String permissions;

    public Admin(String _Name, String _permissions) {
		super(_Name);
        this.permissions = _permissions;
	}

    public get_permissions(){
        return this.permissions;
    }
}