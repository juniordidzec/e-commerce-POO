import java.util.Date;
import java.util.UUID;

public class User {
	public Integer ID;

    public User() {
		this.ID = UUID.randomUUID();
	}
}