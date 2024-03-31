import java.util.Date;
import java.util.ArrayList;

public class Customer extends User {
    public String address;
    public String payment_method;
    public String[4] cards;
    ArrayList<Itens> cart;


    public Customer(String _address, String _payment_method, String _card) {
		super();
        this.address = _address;
        this.payment_method = _payment_method;
        this.cards[0] = _card;
	}

}
