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

//Nas classes user, admin e customer seguimos o princípio de segregação de interfaces(I), temos a classer Admin e Customer 
//que herdam da classe User, mas seus comportamentos são bastante diferentes. Para isso criamos interfaces específicas
//para cada tipo de usuário, contendo apenas os métodos relevantes para aquele usuário. 
//Elas também seguem o princípio do aberto/fechado (O) pois a classe user possui saubclasses customer e admin, que foram
//criadas sem modificar a classe user existente.
