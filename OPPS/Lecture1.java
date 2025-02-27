package OPPS;

class Pen{
    private String color;
    private int tip;
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
}
class BankAccount{
    public String Username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}
public class Lecture1 {
    public static void main(String[] args) {
        Pen p1=new Pen(); //created a pen object p1
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.print(p1.getColor());
        System.out.println(p1.getTip());

        //Access Modifier
        BankAccount myAcc=new BankAccount();
        myAcc.Username="Shirshak Kumar";
        myAcc.setPassword("0000");
        System.out.println(myAcc);// not visible
    }
}

