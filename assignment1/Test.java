/**
 * Class Test
 *
 * @author Xin Zhao (A00898485)
 * @version 1.0
 */

public class Test {
    /**
     * @param args
     */
    public static void main(String[] args){
        new Test().nameTest();
        System.out.println();
        new Test().bookStoreTest();
        System.out.println();
        new Test().shoeStoreTest();
    }

    public void nameTest() {
        Name name1 = new Name("tIgEr", "WOODS");
        Name name2 = new Name("ANdREw", "LlOyD", "wEbBeR");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("Name Test:");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(name1.getFullName());
        System.out.println(name2.getFullName());
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    public void bookStoreTest() {
        Address address = new Address("1234", "Main Street", "Vancouver", "A3A A4A");
        BookStore bs = new BookStore(address, "Chapters", BookType.FICTION);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("BookStore Test:");
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayAllBooksByEveryAuthor();
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayAllBooksByAuthor("sAlInGeR");
        // bs.displayAllBooksByAuthor("sAlInGe");
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayAllBooksWrittenBefore(1970);
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayTitlesOfBooksWrittenBy("JD");
        // bs.displayTitlesOfBooksWrittenBy("JDK");
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayAllBooksForGenre("NONFICTION");
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayTotalWeightKgOfAllBooks();
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayAllBooksWrittenByAuthorsOverThisAge(31);
        bs.displayAllBooksWrittenByAuthorsOverThisAge(70);
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayAllBooksWrittenByAuthorsBornOn("wEdNeSdAy");
        bs.displayAllBooksWrittenByAuthorsBornOn("FRIDAY");
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayAllBooksPublishedOn("SUNDAY");
        bs.displayAllBooksPublishedOn("TuEsDaY");
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayAllBooksWrittenByAuthorsWithAPseudonym();
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayBookWithBiggestPercentageMarkup();
        System.out.println("-----------------------------------------------------------------------------------------------");
        bs.displayAllBooksWrittenOutsideSpecialty();
        System.out.println("-----------------------------------------------------------------------------------------------");
    }

    public void shoeStoreTest() {
        Address address = new Address("789", "East 1st Street", "West Vancouver", "V3A 7A4");
        ShoeStore ss = new ShoeStore(address, "My Shoes", ShoeType.CHILDREN);
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("ShoeStore Test:");
        System.out.println("-----------------------------------------------------------------------------------------------");
        ss.displayAllShoesAndDesigners();
        System.out.println("-----------------------------------------------------------------------------------------------");
        ss.displayAllShoesByDesigner("Sketchers");
        ss.displayAllShoesByDesigner("Robert Cobbler");
        System.out.println("-----------------------------------------------------------------------------------------------");
        ss.displayAllShoesMadeOf(Material.CLOTH);
        System.out.println("-----------------------------------------------------------------------------------------------");
        ss.displayAllShoesMadeOf("plastic");
        System.out.println("-----------------------------------------------------------------------------------------------");
        Name designer1 = new Name("Geox");
        ss.displayNumberOfShoesDesignedBy(designer1);
        System.out.println("-----------------------------------------------------------------------------------------------");
        ss.displayNumberOfShoesDesignedBy("Cobbler");
        System.out.println("-----------------------------------------------------------------------------------------------");
        ss.displaySmallestShoeSize();
        System.out.println("-----------------------------------------------------------------------------------------------");
        ss.displayTotalWeightKgOfAllShoes();
        System.out.println("-----------------------------------------------------------------------------------------------");
        Name designer2 = new Name("Sketchers");
        ss.displayAllShoesOfThisMaterialMadeByThisDesigner(Material.LEATHER, designer2);
        Name designer3 = new Name("Nike");
        ss.displayAllShoesOfThisMaterialMadeByThisDesigner(Material.PLASTIC, designer3);
        System.out.println("-----------------------------------------------------------------------------------------------");
        ss.displayAllShoesNotInMatchingStore();
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}