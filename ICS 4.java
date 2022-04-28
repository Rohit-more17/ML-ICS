import java.util.* ;
import java.lang.*;

class RSAI
{
    public static double gcd(double a, double h)
    {
        double temp;
        while(true)
        {
            temp=a%h;
            if(temp == 0)
            return h;
            a = h;
            h = temp;
        }
    }
    
    public static void main(String[] args)
    {
        double p = 3;
        double q = 7 ;
        double n = p * q ;
        double count ;
        double totient = (p-1)*(q-1);
        
        double e = 2 ;
        
        while(e<totient){
            count = gcd(e,totient);
            if(count == 1)
                break;
            else 
                e++;
        }
        
        double d;
        
        double k = 2 ;
        
        
        d=(1+(k*totient)/e);
        double msg = 12 ;
        double c = Math.pow(msg,e);
        double m = Math.pow(c,d);
        c=c%n;
        m=m%n;
        
        System.out.println("Message data = "+msg+"\n");
        
        System.out.println("p= "+p);
        System.out.println("q= "+q);
        System.out.println("n = pq ="+n);
        System.out.println("totient= "+totient);
        System.out.println("e="+e);
        System.out.println("d="+d);
        System.out.println("encrypted Data = "+c);
        System.out.println("Original Message sent = "+m);
    }
}
