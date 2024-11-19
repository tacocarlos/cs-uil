public class Main {

    public static void main(String[] args) {
        System.out.println("HiLo2");
        HiLo game = new HiLo(10);
        game.play();
        game.setRangeMax(1000);
        game.play();
    }
}
