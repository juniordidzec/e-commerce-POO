import java.util.Date;
import java.util.ArrayList;
import main.Items;

public class Customer extends User implements CustomerUser {
    private String address;
    private String payment_method;
    private String[4] cards;
    private ArrayList<Items> cart = new ArrayList<>();

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
    
    public pay() {
        //Use this.cards to pay;
    }
    
    public clear_cart() {
        this.cart.clear();
    }

    public remove_item_to_cart(Items _item) {
        this.cart.remove(_item);
	}

    public add_card(int _index, String _card) {
        this.cards[_index] = _card;
	}

    public remove_card(int _index) {
        this.cards[_index] = null;
	}
}
