public class Chapter4 {
    public static void main(String[] args) {
        int[] moneyList = {12902, 8302, 55100};
        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }
        for (int m : moneyList) {
            System.out.println(m);
        }
    }
}