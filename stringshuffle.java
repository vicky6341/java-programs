import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc=new  Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        String s3=sc.nextLine();
        int i=0,j=0,k=0;
        if(s1.length()+s2.length()!=s3.length())
         System.out.println("NO");
        while(k<s3.length())
        {
            if(i<s1.length() && s1.charAt(i)==s3.charAt(k))
             i+=1;
            else if(j<s2.length() && s2.charAt(j)==s3.charAt(k))
             j+=1;
            else
             break;
            k+=1;
        }
        if(i<s1.length() || j<s2.length())
         System.out.println("NO");
        else
         System.out.println("Yes");
    }
}
