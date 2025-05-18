package programe;

public class Mine {
    public static void main(String[] args) {
        Date x = new Date(30,6,2000);
        System.out.println(x.toString());
        Date b = new Date(30,6,2000);
        System.out.println(x.equals(b));
        System.out.println(x.before(b));
        x.addDays(1400000);
        System.out.println(x.toString());
        Weight w = new Weight(2,10045);
        System.out.println(w.toString());
        w = w.add(new Weight(10,20000));
        System.out.println(w.toString());
        System.out.println(123456789/100000000);
    }
}
