import java.net.http.HttpResponse;

//hierarchy inheritance
class Bank{
    //parent
    double intrestRate(){
        return 5.5;
    }
}
class BOFA extends Bank{//bank of america bofa
    //child1
    @Override
    double intrestRate(){       //overriding  as the signature of the method is same
        return 7.5;
    }
}
class JPM extends Bank{
    //child2
@Override
    double intrestRate() {
        return 9.5;
    }
}

public class methodOverriding {
    public static void main(String[] args) {
    BOFA obj=new BOFA();
   double result= obj.intrestRate();
        System.out.println(result);

        JPM obj1=new JPM();
        double result1= obj1.intrestRate();
        System.out.println(result1);

    }
}
