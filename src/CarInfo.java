 class Cars{
    String color;
    String brand;
    Cars(String color,String brand){
        this.color=color;
        this.brand=brand;
    }
    void displayinfo(){
        System.out.println("car:"+color+" "+brand);
    }
}
public class CarInfo {
    public static void main(String[] args) {
        Cars car1=new Cars("Red","Honda");
        Cars car2=new Cars("Blue","Toyota");
        car1.displayinfo();
        car2.displayinfo();
    }
}
