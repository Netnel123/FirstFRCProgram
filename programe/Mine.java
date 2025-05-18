package programe;

public class Mine {
    public static void main(String[] args) {
      Baby b = new Baby("Tomas",123456789,new Date(10,3,2024),new Weight(12,4));
        System.out.println(b.toString());
        b.updateCurrentWeight(12000);
        System.out.println(b.toString());
    }
}
