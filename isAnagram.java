import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    if (a.length() == b.length())
    {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        char temp;
        for(int i = 0; i<a.length(); i++)
        {
            for(int j = i+1; j<a.length(); j++)
            {
                if(a1[j]<a1[i])
                {
                    temp = a1[j];
                    a1[j]=a1[i];
                    a1[i]=temp;
                }
            }
        }
        String str1 = String.valueOf(a1);
        
        for(int i = 0; i<b.length(); i++)
        {
            for(int j = i+1; j<b.length(); j++)
            {
                if(b1[j]<b1[i])
                {
                    temp = b1[j];
                    b1[j]=b1[i];
                    b1[i]=temp;
                }
            }
        }
        String str2 = String.valueOf(b1);
        return str1.contains(str2);
    }
    
    
    
    else
    return false;
   
     }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
