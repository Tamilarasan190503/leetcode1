import java.util.*;
public class Removeelemet {
    public static void main(String[] args){
        Scanner  b = new Scanner(System.in);
        int n[]={1,2,3,2,5,6};
        int v=2;
        int c= 0;
        for(int i=0;i<n.length;i++){
            while(n[i]!=v){
                n[c]=n[i];
                c++;
            }
        }
        System.out.print(c);
    }
}
