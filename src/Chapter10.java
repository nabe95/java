public class Chapter10 {
    public static void main(String[] args) {
        String name = "ミナト";
        int hp = 100;
        public void attack(Matango m){
            System.out.println(this.name + "の攻撃!");
            m.hp -= 5;
            System.out.println("5ポイントのダメージをあたえた!");
        }
        public void run() {
        System.out.println(this.name + "は逃げ出した!");
        }
    }
}
