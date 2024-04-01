import java.util.Date;
import java.util.UUID;

public class Items implements SellItem {
	private Integer ID;
  private String png;
  private Float price;
  private String description;
  private int quantity;

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

  public get_quantity(){
    return this.quantity;
  }
}

//Na classe Items temos o princípio de responsabilidade única sendo seguida(S) , a classe Items tem apenas uma única 
//responsabilidade que é representar um único item. 

//A classe base items segue o princípio da substituição de Liskov(L), pois todas as suas subclasses herdam e usam todos os métodos de sua classe. 