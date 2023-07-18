package ProjectManageBook;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(12, 02, 2003);
        Date date2 = new Date(10, 05, 2018);
        Date date3 = new Date(17, 45, 1978);

        nameAuthor author1 = new nameAuthor("Tran Minh A", date1);
        nameAuthor author2 = new nameAuthor("Tran Van A", date2);
        nameAuthor author3 = new nameAuthor("Nguyen Thị Nở", date3);

        ManageBook manage1 = new ManageBook("Nha gia kim", 180000, 1999, author1);
        ManageBook manage2 = new ManageBook("Cho di", 19000, 1989, author2);
        ManageBook manage3 = new ManageBook("Waren Buffer", 50000, 1999, author3);

        manage1.printBook();
        manage2.printBook();
        manage3.printBook();

        System.out.println("Sach 1 co cung năm sach 2: " + manage1.checkYear(manage2));
        System.out.println("Sach 1 co cung năm sach 3: " + manage1.checkYear(manage3));

        System.out.println("Gía sau khi giam sach 1: " + manage1.priceAfterDiscount(10));
        System.out.println("Gía sau khi giam sach 2: " + manage2.priceAfterDiscount(50));
        System.out.println("Gía sau khi giam sach 3: " + manage3.priceAfterDiscount(30));

    }
}
