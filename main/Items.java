import java.util.Date;
import java.util.UUID;

public class Items {
	public Integer ID;
  public String png;
  public Float price;
  public String description;
  public int quantity;

  public Items(String _png, Float _price, String _description, int _quantity) {
    this.ID = UUID.randomUUID();
    this.png = _png
    this.price = _price
    this.description = _description
    this.quantity = _quantity
  }

  public reduce_quantity(){
    this.quantity = this.quantity - 1;
  }

  public edit_item(String _png, Float _price, String _description, int _quantity){
    this.png = _png
    this.price = _price
    this.description = _description
    this.quantity = _quantity
  }
}