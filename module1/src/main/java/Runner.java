import by.kuzmich.BinarySearchUtil;

public class Runner {

    public static void main(String[] args) {

        int index = BinarySearchUtil.recursiveBinarySearch(new int[]{1, 2, 3, 4, 5, 9, 11, 21, 22, 45, 94}, 0, 10, 22);

        System.out.println("index = " + index);
    }
}
