
//This key word is used when the instance variable and the local variable are same so to differentiate them we use this keyword.
public class this_keyword1 {
    int x,y;

    void setValues(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        this_keyword1 obj=new this_keyword1();
        obj.setValues(10,20);
        obj.display();
    }
}
