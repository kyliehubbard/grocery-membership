public class GroceryItem {
    private String itemName;
    private double price;
    private int inventory; 
    private int SKU;
    private GroceryCategory itemCategory;

    public GroceryItem(String itemName, double price, int inventory, int SKU, GroceryCategory itemCategory){
        this.itemName = itemName;
        this.price = price;
        this.inventory = inventory;
        this.SKU = SKU;
        this.itemCategory = itemCategory;
    }

    public void setItemName (String item){
        this.itemName = item;
    }
    public void setPrice(double p){
        this.price = p;
    }
    public void setInventory (int i){
        this.inventory = i;
    }
    public void setSKU (int skew){
        this.SKU = skew;
    }
    public void setItemCategory (GroceryCategory c){
        this.itemCategory = c;
    }
    public String getItemName(){
        return itemName;
    }
    public double getPrice(){
        return price;
    }
    public int getInventory(){
        return inventory;
    }
    public int getSKU(){
        return SKU;
    }
    public GroceryCategory getItemCategory(){
        return itemCategory;
    }
}
