public class BList {

    public static Node ilkNode = new Node(0, 0, "ilkNode", 0);
    public static Node sonNode = new Node(0, 0, "sonNode", 999999999);

    public static void oluşturma() {
        ilkNode.sonraki = sonNode;
        sonNode.onceki = ilkNode;
        sonNode.sonraki = null;
        ilkNode.onceki = null;
    }

    public static void ekle(double barkod, double tutar, String ürün) {

        Node yeniNode = new Node(barkod, tutar, ürün, 0);
        Node aktif = ilkNode.sonraki;

        while (aktif != null) {

            if (barkod < aktif.barkod) {
                yeniNode.sonraki = aktif;
                yeniNode.onceki = aktif.onceki;
                aktif.onceki.sonraki = yeniNode;
                aktif.onceki = yeniNode;
                index();
                return;
            } else {
                aktif = aktif.sonraki;
            }
        }

        yeniNode.sonraki = sonNode;
        yeniNode.onceki = sonNode.onceki;
        sonNode.onceki.sonraki = yeniNode;
        sonNode.onceki = yeniNode;
        index();
    }

    public static void index(){
        Node aktif = ilkNode;
        int i = 0;
        while (aktif != null){
            aktif.index = i;
            aktif = aktif.sonraki;
            i += 1;
        }
    }

    public static void listele() {

        Node aktif;
        aktif = ilkNode;
        while (aktif != null) {
            System.out.println("| Node | " + aktif.hashCode());
            System.out.println("| Barkod: " + aktif.barkod);
            System.out.println("| Ürün: " + aktif.ürün);
            System.out.println("| İndex: " + aktif.index);
            System.out.println("| Tutar: " + aktif.tutar);

            if (aktif.sonraki == null) {
                System.out.println("| Sonraki: null");
            } else {
                System.out.println("| Sonraki: " + aktif.sonraki.hashCode());
            }

            if (aktif.onceki == null) {
                System.out.println("| Önceki: null");
            } else {
                System.out.println("| Önceki: " + aktif.onceki.hashCode());
            }
            System.out.println("| -------------------------- |");
            aktif = aktif.sonraki;

        }
    }


}
