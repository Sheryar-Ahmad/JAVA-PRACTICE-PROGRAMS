public class RemovingSpaces {
    public static void main(String[] args) {
        // Removing spaces from the String
        String str="Sh  er  y    a    r";

        str=str.replaceAll("\\s","");
        System.out.println(str);

    }
}
