import java.util.Date;
import java.util.ArrayList;
import main.Items;

public class Sale_list {
    public String address;
    public String payment_method;
    public String[4] cards;
    ArrayList<Items> cart = new ArrayList<>();


    public Sale_list(String _Name, String _address, String _payment_method, String _card) {
		super(_Name);
        this.address = _address;
        this.payment_method = _payment_method;
        this.cards[0] = _card;
	}

}
