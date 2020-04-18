package Array;

public class Arrays {
    public static void main(String[] args) {
        //定义并初始化
        int[] array = {1,2,3,4,5};
        System.out.println("定义并初始化"+java.util.Arrays.toString(array));

        //匿名数组
        int[] array2 = new int[]{7,8,9,4,5,6};
        System.out.println("匿名数组"+java.util.Arrays.toString(array2));

        //数组拷贝
        int[] array3 = array2;
        System.out.println("数组拷贝"+java.util.Arrays.toString(array3));

        //Arrays.copyOf方法
        int[] array4 = java.util.Arrays.copyOf(array, 2*array.length);
        System.out.println("Arrays.copyOf方法"+java.util.Arrays.toString(array4));

        //数组排序
        int[] array5 = {568, 4588, 56, 182, 365};
        java.util.Arrays.sort(array5);
        System.out.println("数组排序"+java.util.Arrays.toString(array5));
    }
}
