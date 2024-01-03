public class Node {
    public double barkod; // E343J232F2
    public double tutar;
    public String ürün;
    public int index;
    public Node sonraki;
    public Node onceki;


    public Node(double barkod, double tutar, String ürün, int index) {
        this.barkod = barkod;
        this.index = index;
        this.tutar = tutar;
        this.ürün = ürün;
        this.onceki = null;
        this.sonraki = null;
    }
}