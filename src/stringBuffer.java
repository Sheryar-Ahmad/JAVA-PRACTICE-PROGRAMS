public class stringBuffer {
    public static void main(String[] args) {
        // reverse of the String using the string buffer built in reverse method

        StringBuffer sb=new StringBuffer("Sheheryar");
        System.out.println(sb.reverse());


        //String buffer is more efficient in the memory utilization
        //it is mutable as we can change the value of the string
        //it is synchoronize as it means that if there are parallel thread running like there are
        //three threads and the during the run time the one of the thread is using and changing the values
        //the other two threads cannot the that variable as it is locked
        //String buffer is less efficient as the program would execute slowly as the variable are locked when
        // are used during the execution
        // it was introduced in the java 1.0

        sb = new StringBuffer("SHEHERYAR");
        System.out.println(sb);
    }

}
