public class BronzeMember extends Member{
    private double gasPurchases;
    private double groceryPurchases;
    private double everydayPurchases;

    public BronzeMember(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID,
    int monthJoined, int yearJoined, double dues, double gasPurchases, double groceryPurchases,
    double everydayPurchases){
        super(name, age, yearsMember, phone, goodStanding, memberID, monthJoined, yearJoined, dues);
        this.gasPurchases = gasPurchases;
        this.groceryPurchases = groceryPurchases;
        this.everydayPurchases = everydayPurchases;
    }

    public void setGasPurchases(double gp){
        this.gasPurchases = gp;
    }
    public double getGasPurchases(){
        return gasPurchases;
    }
    public void setGroceryPurchases(double grop){
        this.groceryPurchases = grop;
    }
    public double getGroceryPurchases(){
        return groceryPurchases;
    }
    public void setEverydayPurchases(double evep){
        this.everydayPurchases = evep;
    }
    public double getEverydayPurchases(){
        return everydayPurchases;
    }

    double calculateCashBack(){
        return 0;
    }

    double calculateDues(){
        return 0;
    }
}
