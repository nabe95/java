public class Practice2 {
    public static void main(String[] args) {
        // int型の2次元配列の配列の宣言
        int[][] array = new int[3][3];

        // 配列の各要素に値を代入
        array[0] = new int[]{2,4,6};
        array[1] = new int[]{3,6,9};
        array[2] = new int[]{4,8,12};

        // 配列の要素を表示
        for (int i = 0; i < array.length; i++) {
            System.out.print("要素[" + i + "] = ");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
