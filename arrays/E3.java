class E3 {
public static void main(String[] args) {
        int[] ids = new int[4];
        for (int k =0; k < ids.length; k++) {
                System.out.println("ids " + ids[k]);

                //imprimirá:
                /**
                 * ids 0
                 * ids 0
                 * ids 0
                 * ids 0
                 */
        }

        String nomes[] = new String[3];

        for (int p =0; p < ids.length; p++) {
                System.out.println("nomes " + nomes[p]);

                //imprimirá:
                /**
                 * nomes null
                 * nomes null
                 * nomes null
                 *
                 */
        }
}
}
