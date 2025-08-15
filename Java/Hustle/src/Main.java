// c = 2(pi)(r)
// a = pi(r * r)
// v = 4/3(pi * r * r * r)
public class Main{
    public static void main(String[] args){
        double c, r, a, v;
        r=20;
        c = 2*Math.PI*r;
        System.out.printf("%.1f\n",c);
        a = Math.PI * (Math.pow(r, 2));
        System.out.printf("%.1f\n",a);
        v = 4/3.0 * (Math.PI * Math.pow(r, 3));
        System.out.printf("%.1f\n",v);
    }
}