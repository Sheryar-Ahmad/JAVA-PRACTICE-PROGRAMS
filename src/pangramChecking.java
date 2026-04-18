public class pangramChecking {
    public static void main(String[] args) {
        String str="The quick brown fox jump over the lazy dog";
        //  String str="abcdefghijklmnopqrstuvwxyz";
        int flag=1;
        //This string contains all the alphabets
        //pangram is the string that contains all the alphabets from a to z
        // first we have to check that the string must be of  the 26 letter
        str=str.toLowerCase();

        if (str.length()<26){
            System.out.println(str+" Is not a pangram");
        }else{
            for (char ch='a';ch<='z';ch++){
                if (str.indexOf(ch)<0){
                    flag=0;
                }
            }
        }
        if (flag==1){
            System.out.println(str+" : is a pangram");
        }else {
            System.out.println(str+" : is not a pangram");
        }

    }
}
