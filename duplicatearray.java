public class Duplicate {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 2, 4, 1, 6, 7, 7, 9, 10};
        System.out.println("duplicate elements are");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}
