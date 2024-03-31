import java.util.Date;
import java.util.ArrayList;
import main.Items;

public class Customer {
    public String address;
    public String payment_method;
    public String[4] cards;
    ArrayList<Items> cart = new ArrayList<>();


    public Customer(String _Name, String _address, String _payment_method, String _card) {
		super(_Name);
        this.address = _address;
        this.payment_method = _payment_method;
        this.cards[0] = _card;
	}

    public edit_info(String _address, String _payment_method) {
        this.address = _address;
        this.payment_method = _payment_method;
	}

    public add_item_to_cart(Items _item) {
        this.cart.add(_item);
	}

    public remove_item_to_cart(Items _item) {
        this.cart.remove(_item);
	}
    
    public clear_cart() {
        this.cart.clear();
	}

    public pay() {
        //Use this.cards to pay;
	}

    public add_card(int index, String _card) {
        this.cards[index] = _card;
	}

    public remove_card(int index) {
        this.cards[index] = null;
	}
}
