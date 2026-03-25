// ISP (Interface Segregation): split Borrowable into Returnable and Borrowable
public interface Borrowable {
    void borrowBook(User user);
}
