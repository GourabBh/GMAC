package Number;

public class Palindrome {
    int n;
    boolean ind;

    Palindrome(int n){
        this.n = n;
    }

    public boolean checkPalindrome(Palindrome p) {
        int dup = p.n, rev = 0;
        while(dup > 0){
            int r = dup % 10;
            rev = rev * 10 + r;
            dup /= 10;
        }
        if(rev == p.n)
            return true;
        else
            return false;
    }
}
