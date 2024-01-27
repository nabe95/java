public class Practice {
    public static void main(String[] args) {
        // 文字型の配列の宣言,3つの要素を持つ配列を作成
        String[] array = new String[3];

        // 配列の各要素に値を代入
        array[0] = "{2,4,6}";
        array[1] = "{3,6,9}";
        array[2] = "{4,8,12}";

        // 配列の要素を表示
        for (int i = 0; i < array.length; i++) {
            System.out.println("要素[" + i + "] = " + array[i]);
        }
    }
}