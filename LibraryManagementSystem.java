import java.util.Scanner;

class Book{

    String title;
    String author;
    int isbn;
    String category;
    boolean availability_status;

    Book(String title,String author,int isbn,String category,boolean availability_status){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.category=category;
        this.availability_status=true;
    }
    void Bookinfo(){
        System.out.println("Title:"+title+"\n"+"Author:"+author+"\n"+"ISBN:"+isbn+"\n"+"Category:"+category);
        System.out.println("-------------------------------------------------------------------------------");
    }


    void borrow(int book_num,boolean availability_status){
        System.out.println("You have borrowed a book: "+"\n"+title);
        availability_status=false;


    }

}

public class LibraryManagementSystem {
    private static boolean availability_status;

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);


        Book b1=new Book("It ends with us","WilliamJame",123,"Romance",true);
        b1.Bookinfo();

        System.out.println("Choose a book");
        int choose=sc.nextInt();
        b1.borrow(choose,availability_status);




    }
}
