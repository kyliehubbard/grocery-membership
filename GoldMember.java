public class GoldMember extends Member{
    private double restaurantPurchases;
    private double travelPurchases;

    public GoldMember(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID,
    int monthJoined, int yearJoined, double dues, double restaurantPurchases, double travelPurchases){
        super(name, age, yearsMember, phone, goodStanding, memberID, monthJoined, yearJoined, dues);
        this.restaurantPurchases = restaurantPurchases;
        this.travelPurchases = travelPurchases;
    }

    public void setRestaurantPurchases(double resp){
        this.restaurantPurchases = resp;
    }
    public double getRestaurantPurchases(){
        return restaurantPurchases;
    }
    public void setTravelPurchases(double trap){
        this.travelPurchases = trap;
    }
    public double getTravelPurchases(){
        return travelPurchases;
    }

    double calculateCashBack(){
        return 0;
    }

    double calculateDues(){
        return 0;
    }
}
