package iventory;

public class DVD extends product{
    private int length;
    private String rating;
    private String studio;

    public DVD() {
        super();
        length = 0;
        rating = "";
        studio = "";

    }

    public DVD(int number, String name, int quantity, double price, String artist, int numSong , String label) {
        super(number, name, quantity, price);
        this.length = length;
        this.rating = rating;
        this.studio = studio;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setAtudio(String studio) {
        this.studio = studio;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Length: " + length);
        System.out.println("Rating: " + rating);
        System.out.println("Studio: " + studio);
    }
}
