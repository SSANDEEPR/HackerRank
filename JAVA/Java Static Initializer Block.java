import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int B,H;
    Scanner sc = new Scanner(System.in);
    B = sc.nextInt();
    H = sc.nextInt();
    if (B>=0 && B<100 && H>=0 && H<100 ){
        System.out.print(B*H);
    }
    else {
        System.out.print("java.lang.Exception: Breadth and height must be positive");
    }
}
        
    }
