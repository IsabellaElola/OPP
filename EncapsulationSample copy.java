public class EncapsulationSample {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentId(2312318);
        student1.setName("Isabella Grace M. Elola");

        System.out.println("Student ID: " + student1.getStudentId());
        System.out.println("Name: " + student1.getName());

        Book book1 = new Book();
        book1.setBookNumber(1251);
        book1.setTitle("Verity");
        book1.setAuthor("Colleen Hoover");
        book1.setPrice(845.99);

        System.out.println("\nBook Details:");
        System.out.println("Book Number: " + book1.getBookNumber());
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: Php" + book1.getPrice ());
    }
}
