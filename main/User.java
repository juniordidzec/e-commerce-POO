import java.util.Date;
import java.util.UUID;

public class User {
	public Integer ID;
    public String Name;
    public User(String _Name) {
		this.ID = UUID.randomUUID();
        this.Name = _Name;
	}
}