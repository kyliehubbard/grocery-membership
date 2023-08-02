public class PlatinumMember extends Member{
    private double entertainmentPurchases;
    private double recurringPurchases;
    private double transportationPurchases; 

    public PlatinumMember(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID,
    int monthJoined, int yearJoined, double dues, double entertainmentPurchases, double recurringPurchases,
    double transportationPurchases){
        super(name, age, yearsMember, phone, goodStanding, memberID, monthJoined, yearJoined, dues);
        this.entertainmentPurchases = entertainmentPurchases;
        this.recurringPurchases = recurringPurchases;
        this.transportationPurchases = transportationPurchases;
    }

    public void setEntertainmentPurchases(double ep){
        this.entertainmentPurchases = ep;
    }
    public double getEntertainmentPurchases(){
        return entertainmentPurchases;
    }
    public void setRecurringPurchases(double rp){
        this.recurringPurchases = rp;
    }
    public double getRecurringPurchases(){
        return recurringPurchases;
    }
    public void setTransportationPurchases(double tp){
        this.transportationPurchases = tp;
    }
    public double getTransportationPurchases(){
        return transportationPurchases;
    }

    double calculateCashBack(){
        // change!
        return 0;
    }

    double calculateDues(){
        // change!
        return 0;
    }
}
