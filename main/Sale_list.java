import main.Items;
import java.util.ArrayList;

public class Sale_list {
    private ArrayList<Items> Items_list = new ArrayList<>();

    public add_item(Items _item) {
        this.Items_list.add(_item);
	}

    public remove_item(Items _item) {
        this.Items_list.remove(_item);
	}

    public buy_item(Items _item) {
        _item.quantity.reduce_quantity();
	}
}
