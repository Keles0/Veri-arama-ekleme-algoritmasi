import java.util.ArrayList;

public class BST {
    public static Node ara(double barkod) {
        Node aktif = BList.ilkNode;
        Node minNode = BList.ilkNode;
        Node maxNode = BList.sonNode;

        int left = 0;  // Başlangıçta left'i 0 olarak ayarla
        int right = BList.sonNode.index - 1;  // right'i listenin boyutu - 1 olarak ayarla
        int mid;

        while (left <= right) {
            mid = left + (right - left) / 2;  // Mid hesaplamasını düzelt
            aktif = addIndex(BList.ilkNode, mid); // addIndex fonksiyonunu BList sınıfında çağır// ilknode'yi mid kadar arttır aktife aktar
            if (aktif.barkod == barkod) {
                return aktif;
            } else if (aktif.barkod > barkod) {
                right = mid - 1;
                maxNode = aktif;  // maxNode'u güncelle
            } else {
                left = mid + 1;
                minNode = aktif;  // minNode'u güncelle
            }
        }
        return null;
    }

    public static Node addIndex(Node node, int index) {
        Node aktif = node;
        for (int i = 0; i < index; i++) {
            aktif = aktif.sonraki;
        }
        return aktif;
    }

    public static Node removeIndex(Node node, int index) {
        Node aktif = node;
        for (int i = 0; i < index; i++) {
            aktif = aktif.onceki;
        }
        return aktif;
    }
}