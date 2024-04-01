// Interface para usuários com permissões administrativas
public interface AdminUser {
    String getPermissions();
}

// Interface para clientes
public interface CustomerUser {
    void editInfo(String address, String paymentMethod);
    void addItemToCart(Items item);
    void pay();
    void clearCart();
    void removeItemFromCart(Items item);
    void addCard(int index, String card);
    void removeCard(int index);
}