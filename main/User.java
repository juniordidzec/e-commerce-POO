import java.util.Date;
import java.util.UUID;

public class User {
	private Integer ID;
    private String Name;

    public User(String _Name) {
		this.ID = UUID.randomUUID();
        this.Name = _Name;
	}

    public get_id(){
        return this.ID;
    }

    public get_name(){
        return this.Name;
    }
}