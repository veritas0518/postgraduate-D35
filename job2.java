import java.util.*;
public class job2 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        //System.out.printf("Please type a capital letter: ");
        char letter = s.next().charAt(0);
        int line;
        line = (int) letter - 64;
        char aa = 64;

        for (int i=1 ;i<=line;i++){
            for(int j=1;j<=line-i;j++){
                System.out.printf(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.printf("%c",aa+i);
            }
            System.out.println();
        }
        for (int i=line-1 ;i>=1;i--){
            for(int j=1;j<=line-i;j++){
                System.out.printf(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.printf("%c",aa+i);
            }
            System.out.println();
        }


    }

}


