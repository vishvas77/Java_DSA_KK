package bit_wise;

public class no_of_digits {
    public static void main(String[] args) {
        int n=6;
        int base=2;
        int digit= (int)(Math.log10(n)/Math.log10(base))+1;
        System.out.println(digit);
    }
}
