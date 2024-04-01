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
        if (_item.get_quantity > 0){
            _item.quantity.reduce_quantity();
        } else {
            System.out.println("Sorry, this item is unavailable");
        }
	}
}


//A Classe Sale_List segue o princípio da Inversão de Dependência (D), pois ela depende de uma interface SellItem que
//possui todos os métodos necessários para os tipos de item e fazemos a classe Items implementar esssa interface