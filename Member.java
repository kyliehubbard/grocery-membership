abstract class Member {
    private String name;
    private int age;
    private int yearsMember;
    private String phone;
    private boolean goodStanding;
    private int memberID;
    private int monthJoined;
    private int yearJoined;
    private double dues;

    public Member(String name, int age, int yearsMember, String phone, boolean goodStanding, int memberID,
    int yearJoined, int monthJoined, double dues){
        this.name = name;
        this.age = age;
        this.yearsMember = yearsMember;
        this.phone = phone;
        this.goodStanding = goodStanding;
        this.memberID = memberID;
        this.monthJoined = monthJoined;
        this.yearJoined = yearJoined;
        this.dues = dues;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        this.age = a;
    }
    public int getAge(){
        return age;
    }
    public void setYearsMember(int ym){
        this.yearsMember = ym;
    }
    public int getYearsMember(){
        return yearsMember;
    }
    public void setPhone(String p){
        this.phone = p;
    }
    public String getPhone(){
        return phone;
    }
    public void setGoodStanding(boolean gs){
        this.goodStanding = gs;
    }
    public boolean getGoodStanding(){
        return goodStanding;
    }
    public void setMemberID(int mi){
        this.memberID = mi;
    }
    public int getMemberID(){
        return memberID;
    }
    public void setMonthJoined(int mj){
        this.monthJoined = mj;
    }
    public int getMonthJoined(){
        return monthJoined;
    }
    public void setYearJoined(int yj){
        this.yearJoined = yj;
    }
    public int getYearJoined(){
        return yearJoined;
    }
    public void setDues(double du){
        this.dues = du;
    }
    public double getDues(){
        return dues;
    }

    abstract double calculateCashBack();
    abstract double calculateDues();
}
