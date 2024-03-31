import java.util.Date;


public class Admin extends User {
    public String permissions;

    public Admin(String _Name, String _permissions) {
		super(_Name);
        this.permissions = _permissions;
	}
}