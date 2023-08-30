public class Main {

    public static void main(String [] args){
        int sum = 13_676;
        int bonus = 20;

        int total = sum / bonus;

        if (sum < 19) {
            bonus = 0;
        }
        System.out.println("Итоговый бонус: " + total);
    }
}