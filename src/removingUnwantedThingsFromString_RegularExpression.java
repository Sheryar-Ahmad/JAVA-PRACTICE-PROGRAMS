public class removingUnwantedThingsFromString_RegularExpression {
    public static void main(String[] args) {
        String str="32948@$#*@)#(@%&(#Shehe(&*&^^%^ryar is 34232)()^%$%%a good boy*(&#&$^^%$#^8977676";
//        str=str.replaceAll("[a-zA-Z0-9]","");//it would give only the symbols not the string
//        System.out.println(str);

//        String str1=str.replaceAll("[^a-zA-Z]","");//it would remove all the things except the small and capital alphabets
//        System.out.println(str1);


        String str2=str.replaceAll("[^0-9]","");
        System.out.println(str2);
    }
}
