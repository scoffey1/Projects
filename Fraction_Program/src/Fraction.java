/**
 * Code Template Authors: Dr. Stephen Roehrig
 *                        and David G. Cooper
 * Submission Author: Steven Coffey
 * Date: 9/28/21
 * Purpose: An object for holding and adding fractions
 */
public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(int n, int d) {
        // add code here
        this.numerator = n;
        this.denominator = d;
    }
    // greatest common divisor:
    public static int gcd(int a, int b) { 
        if (b == 0) {
            return (a);
        } else {
            return (gcd(b, a % b));
        }
    }

    public String toString() {
        // add code here 
        int g = gcd(this.numerator, this.denominator);
        int n = this.numerator/g;
        int d = this.denominator/g;
        String s = Integer.toString(n) + "/" + Integer.toString(d);
        return s;
    }

    public String toDecimal() {
        // add code here
        double n = (double)this.numerator;
        double d = (double)this.denominator;
        double ans = n/d;
        
        String s = Double.toString(ans);
        return s;
    }

    public Fraction add(Fraction f) {
        // add code here
        int n1 = this.numerator;
        int d1 = this.denominator;
        int n2 = f.numerator;
        int d2 = f.denominator;
        int n3;
        int d3;
        int g = gcd(d1,d2);
        d3 = (d1*d2)/g;
        
        int first = (n1)*(d3/d1);
        int second = (n2)*(d3/d2);
        n3 = first + second;
        
        g = gcd(n3,d3);
        n3 = n3/g;
        d3 = d3/g;
        
        Fraction newFraction = new Fraction(n3,d3);
        return newFraction;
        
        
    }
}