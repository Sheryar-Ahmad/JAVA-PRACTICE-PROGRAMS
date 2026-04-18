public class stringBuilder {
    public static void main(String[] args) {


        StringBuilder sb=new StringBuilder("Ahmad");
        System.out.println(sb);
        // to reverse the String we can use the reverse method of the String Builder
        System.out.println(sb.reverse());




        //it is mutable as we can change the value of the string
        //it is not synchoronize as it means that if there are parallel thread running like there are
        //three threads and the during the run time the one of the thread is using and changing the values
        //the other two threads can also change the values during the execution
        //String Builder is more efficient as the program would execute fastely
        // it was introduced in the java 1.5

    }
}
