package Semqestion;
class Book{
    String title, author ,isbn;
    int publicationYear;
    boolean availability;


    Book(String t , String a , String i , int y){
        
            author = a;
            title = t;
            isbn = i;
            publicationYear = y;
            availability = true;
        
    }

    void displayDetails(){
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("ISBN:" + isbn);
        System.out.println("PublicationYear:" + publicationYear);
        System.out.println("Availability:" + availability);
    }
     void returnBook(){
        availability = false;
     }
     void checkOut(){
        availability = true;
     }


 public static void main (String []args) {
    Book b = new Book("MassMama" , "Halq" ,  "123-321" , 2025-26);
    b.displayDetails();
    b.checkOut();
    b.returnBook();

 } 

}
