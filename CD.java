
package iventory;

public class CD extends product {
    private String artist;
    private int numSong;
    private String label;

    public CD() {
        super(); //mengakses Construktor Superclass
        artist = "james arthur";
        numSong = 1;
        label = "car outside";
    }

    public CD(int number, String name, int quantity, double price, String artist, int numSong , String label) {
        super(number, name , quantity, price);
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;

    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtis(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    @Override //membuat method yg sama dgn method di super class
    public void print(){
        super.print();
        System.out.println("artist : " + artist);
        System.out.println("numSong : " + numSong);
        System.out.println("label : " + label);
    }
}
