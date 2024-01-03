public class Main {
    public static void main(String[] args) {
        BList.oluşturma();
        BList.ekle(227, 56, "Elma");
        BList.ekle(16, 56, "Armut");
        BList.ekle(80, 56, "Kiraz");
        BList.ekle(30, 56, "Vişne");
        BList.ekle(17, 56, "Ananas");
        BList.ekle(2, 56, "Portakal");
        BList.ekle(200, 56, "Deneme1");
        BList.ekle(250, 56, "Deneme2");
        BList.ekle(230, 56, "Deneme3");
        BList.ekle(280, 56, "Deneme4");
        BList.ekle(2444, 56, "Deneme5");
        BList.listele();



        Node a = BST.ara(2444);


        if (a == null){
            System.out.println("Sistemde böyle bir barkod numarası yok.");
        }else {
            System.out.println("-*-*-*-*-*-*-*-*-*-**-*-*--");
            System.out.println("| Node | " + a.hashCode());
            System.out.println("| Barkod: " + a.barkod);
            System.out.println("| Ürün: " + a.ürün);
            System.out.println("| Tutar: " + a.tutar);
            System.out.println("| İndex: " + a.index);
            System.out.println("| Önceki: " + a.onceki.hashCode());
            System.out.println("| Sonraki: " + a.sonraki.hashCode());
            System.out.println("-*-*-*-*-*-*-*-*-*-**-*-*--");
        }
    }
}