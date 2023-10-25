import static java.lang.Double.valueOf;

public class E {
    public void test(){
        Double d = Double.valueOf(6);
        Double d1 = Double.parseDouble("12");
        byte byte_d1 = d1.byteValue();
        short short_d1 = d1.shortValue();
        int int_d1 = d1.intValue();
        long long_d1 = d1.longValue();
        float float_d1 = d1.floatValue();
        double double_d1 = d1.doubleValue();
        System.out.println(d);
        String d2 = Double.toString(3.14);
    }
}