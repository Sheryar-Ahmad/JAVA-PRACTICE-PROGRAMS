class employe{
    int age;
    String name;
    double salary;
    String color;

    void setDetails(int Age,String Name,double sal,String color){
        age=Age;
        name=Name;
        salary=sal;
        this.color=color;
    }

    void display(){
        System.out.println(age+" "+name+" "+salary+" "+color);
    }
}

public class OOP__Methods {
    public static void main(String[] args) {

        employe employe=new employe();
        employe.setDetails(20,"Sheheryar",100.99,"brown");

        employe.display();

    }
}
