import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getItemTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return itemName + " (Price: " + price + ", Quantity: " + quantity + ")";
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
        System.out.println(item.itemName + " added to cart.");
    }

    public void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                System.out.println(itemName + " removed from cart.");
                items.remove(i);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getItemTotal();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("\n--- Shopping Cart ---");
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (CartItem item : items) {
                System.out.println(item);
            }
            System.out.println("Total Cost: " + calculateTotal());
        }
        System.out.println("---------------------\n");
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new CartItem("Laptop", 55000, 1));
        cart.addItem(new CartItem("Mouse", 500, 2));
        cart.addItem(new CartItem("Headphones", 2000, 1));

   
        cart.displayCart();

        cart.removeItem("Mouse");

        cart.displayCart();
    }
}
