package ProjectManageBook;

public class ManageBook {
    private String nameBook;
    private double price;
    private int nameXuatBan;
    private nameAuthor author;

    public ManageBook(String nameBook,double price,int nameXuatBan,nameAuthor author){
        this.nameBook=nameBook;
        this.price=price;
        this.nameXuatBan=nameXuatBan;
        this.author=author;
    }

    public String getNameBook(){
        return this.nameBook;
    }
    public void setNameBook(String nameBook){
        this.nameBook=nameBook;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public nameAuthor getAuthor(){
        return this.author;
    }
    public void setAuthor(nameAuthor author){
        this.author=author;
    }
    public int setNameXuatBan(){
        return nameXuatBan;
    }
    public void getNameXuatBan(int nameXuatBan){
        this.nameXuatBan=nameXuatBan;
    }

    public void printBook(){
        System.out.println("Tên sach " + this.nameBook);
    }

    public boolean checkYear(ManageBook otherBook){
        return this.nameXuatBan == otherBook.nameXuatBan;
    }
    public double priceAfterDiscount(double x){
        return this.price*(1-(x/100));
    }
}
