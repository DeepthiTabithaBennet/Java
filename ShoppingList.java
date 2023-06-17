import java.util.Scanner;

class Item{
    String name;
    String description;
    int price;
   
    public void viewFullDescription(){
        System.out.println("\nEnter the name of the item: ");
        Scanner it = new Scanner(System.in);
        name = it.nextLine();
      
        System.out.println("\nEnter the description: ");
        description = it.nextLine();
     
        System.out.println("\nEnter the price: ");
        price = it.nextInt();
      
        System.out.println("name"+"\t"+"description"+"\t"+"price");
        System.out.println(name+"\t"+description+"\t"+price);
    }
   
    public void addToShoppingBasket(){
        System.out.println("\nYour item is added to shopping basket");
    }
   
    public void removeFromShoppingBasket(){
        System.out.println("\nYour item is removed from shopping basket");
    }
}

class Mp3 extends Item{
    String artist;
    String duration;
    String song;
    
    public void play(){
        System.out.println("\nEnter the name of the song: ");
        Scanner sc = new Scanner(System.in);
        song = sc.nextLine();
        System.out.println("\nThe name of the song is: "+song);
      
        System.out.println("\n"); 
        System.out.println("\nEnter the artist who sang this song: ");
        artist = sc.nextLine();
        System.out.println("The artist who sang this song is: "+artist);
              
        System.out.println("\n");
        System.out.println("\nEnter the duration: ");
        duration = sc.nextLine();
        System.out.println("\nThe duration of this song is: "+duration);
        System.out.println("\n");
    }
    
    public void download(){
        System.out.println("\nEnter the name of the song to be downloaded: ");
        Scanner sc = new Scanner(System.in);
        song = sc.nextLine();
        System.out.println("\nThe song you downloaded is: "+song);
    }
    
    void displayMp3(){
        System.out.println("\n");
        System.out.println(song+"\t"+artist+"\t"+duration);
    }
}

class DVD extends Item{
    String certificate;
    String duration;
    String actors;
    String movie;
    
    public void ViewTrailer(){
        System.out.println("Enter the name of the movie: ");
        Scanner sc = new Scanner(System.in);
        movie = sc.nextLine();
    
        System.out.println("The name of the movie in which we are viewing the trailer is: "+movie);
    
        System.out.println("Enter the certificate: ");
        certificate = sc.nextLine();
        System.out.println("The certificate is: "+certificate);
    
        System.out.println("Enter the duration: ");
        duration = sc.nextLine();
        System.out.println("The duration is: "+duration);
    
        System.out.println("Enter the actors: ");
        actors = sc.nextLine();
        System.out.println("The actors are: "+actors);
    }
    
    void displayDVD(){
        System.out.println(movie+"\t"+certificate+"\t"+duration+"\t"+actors);
    }
}

class Book extends Item{
    String bookname;
    String author;
    int numberOfPages;
    String genre;
    
    public void previewContent(){
        System.out.println("Enter the name of the book: ");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        bookname = sc.nextLine();
    
        System.out.println("The name of the book in which we are previewing the content is: "+bookname);
    
        System.out.println("Enter the author: ");
        author = sc.nextLine();
        System.out.println("The author who wrote the book is: "+author);
    
        System.out.println("Enter the number of pages: ");
        numberOfPages = sc1.nextInt();
        System.out.println("The number of pages are: "+numberOfPages);
    
        System.out.println("Enter the genre: ");
        genre = sc.nextLine();
        System.out.println("The genre is: "+genre);
    }
    
    void displayBook(){
        System.out.println(bookname+"\t"+author+"\t"+numberOfPages+"\t"+genre);
    }
}

public class Iteminheritance {

    public static void main(String[] args) {
        String song = " ";
        String movie = " ";
        String bookname = " ";
        
        Item item = new Item();
        Mp3 mp3 = new Mp3();
        DVD dvd = new DVD();
        Book book = new Book();
        
        item.viewFullDescription();
        item.addToShoppingBasket();
        
        mp3.play();
        System.out.println("song"+"\t"+"artist"+"\t "+"duration");
        mp3.displayMp3();
        item.removeFromShoppingBasket();
        
        
        item.viewFullDescription();
        item.addToShoppingBasket();
        
        dvd.ViewTrailer();
               System.out.println("movie"+"\t"+"certificate"+"\t"+"duration"+"\t"+"actors");
        dvd.displayDVD();
        item.removeFromShoppingBasket();
        
        item.viewFullDescription();
        item.addToShoppingBasket();
        
        book.previewContent();
        System.out.println("bookname"+"\t"+"author"+"\t "+"noofPages"+"\t"+"genre");
        book.displayBook();
        
        item.removeFromShoppingBasket();    
        
    }
    
}
