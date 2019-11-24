

import java.util.Scanner;

public class DriverBT {
    public static void main (String []args){
        String kata;
        Scanner scanner =new Scanner(System.in);
        System.out.println("masukkan kata");
        kata=scanner.nextLine();

        BinaryTree pohon = new BinaryTree();
        for (int i = 0; i < kata.length(); i++) {
            pohon.NewData(kata.charAt(i));
        }
        pohon.printInOrder();
        pohon.printPre();
        pohon.printPost();

        pohon.printInOrderInt();
        pohon.printPreInt();
        pohon.printPostInt();
    }

}
