import java.util.ArrayList;

public class OnlineOrder {
    private Member member;
    private double costOrder;
    private int numItems;
    private ArrayList<GroceryItem> basketItems;

    public OnlineOrder(Member member, double costOrder, int numItems, ArrayList<GroceryItem> basketItems){
        this.member = member;
        this.costOrder = costOrder;
        this.numItems = numItems;
        this.basketItems = basketItems;
    }

    public void setMember(Member m){
        this.member = m;
    }
    public Member getMember(){
        return member;
    }
    public void setCostOrder(double co){
        this.costOrder = co;
    }
    public double getCostOrder(){
        return costOrder;
    }
    public void setNumItems(int ni){
        this.numItems = ni;
    }
    public int getNumItems(){
        return numItems;
    }
    public void setBasketItems(ArrayList<GroceryItem> bi){
        this.basketItems = bi;
    }
    public ArrayList<GroceryItem> getBasketItems(){
        return basketItems;
    }

    public double totalCostBasket(ArrayList<GroceryItem> basket) {
        double totalCost = 0.0;
        for (GroceryItem item : basket) {
            totalCost += item.getPrice();
        }
        return totalCost;
    }
}
