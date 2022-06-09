import java.util.Scanner;
public class BozQARINE {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int n = input.nextInt();
        if(n>=1 && n<=100 && str.length()>=1 && str.length()<=100 ){

            char tst = 'a';
            for(int k = 0; k < 26; k++)
            {
                tst++;
                str.replace(tst++, tst);
            }
            StringBuffer sbf = new StringBuffer(str);
            String str2 =  sbf.reverse();
            if(str.compareTo(str2))
            { System.out.println("YES");}
            else
            {System.out.println("NO");}

        }
    }
}

