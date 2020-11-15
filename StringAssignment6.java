1.class string1
{
  public static void main(String[]args)
  {
    int vowel=0;
    int consonant=0;
     int number=0;
    int space=0;
    String s = "hello2 3467";
   //String g = "0123456789";
    char[] ch = s.toCharArray();
    //StringBuilder sb = new StringBuilder();
    for(int i=0;i<s.length();i++)
    {
        System.out.println(s.charAt(i));
      if(s.charAt(i)== 'a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
      {
        
          vowel = vowel+1;
          
      }else if(s.charAt(i) !='a' ||s.charAt(i)!= 'e' ||s.charAt(i)!= 'i' ||s.charAt(i)!= 'o' ||s.charAt(i)!= 'u'|| s.charAt(i)!='1'||s.charAt(i)!='2'||s.charAt(i)!='3'||s.charAt(i)!='4'||s.charAt(i)!='5'||s.charAt(i)!='6'||s.charAt(i)!='7'||s.charAt(i)!='9'||s.charAt(i)!='8')
      {
         consonant=consonant+1;
        
      }else if(s.charAt(i)==' ')
      {
          space =space+1;
      }
     }
      for(char c : ch)
      {
         if(Character.isDigit(c))
         {
               number = number+1;
         }
      }
     System.out.println("vowel:"+vowel);
     System.out.println("consonant:"+consonant);
     System.out.println("number is:"+number);
    System.out.println("space is:"+space); 
    }
} 




2.import java.util.*; 
  
class string1 
{ 
    static void removeDuplicate(char[] S)  
    { 
        int n = S.length; 
        if (n < 2)  
        { 
            return; 
        }  
        int j = 0;  
        for (int i = 1; i < n; i++)  
        {
            if (S[j] != S[i]) 
            {
                j++; 
                S[j] = S[i]; 
            } 
        } 
       System.out.println(Arrays.copyOfRange(S, 0, j+1 )); 
    } 
  
    public static void main(String[] args) 
    { 
        char S1[] = "aaaabccd".toCharArray(); 
        removeDuplicate(S1); // direct called the function since static method is used.
        char S2[] = "a".toCharArray(); 
        removeDuplicate(S2); 
    } 
}



3.class string1 
 { 
    static void count(String str) 
    { 
        char[] ch = str.toCharArray(); 
        for (int i = 0; i < ch.length; i++) 
        { 
            String s = ""; 
 
            while (i < ch.length && ch[i] != ' ')
            { 
  
                s = s + ch[i]; 
                i++; 
            } 
  
            if (s.length() > 0)  
                System.out.print(s.length()+" ");             
        } 
    } 
    public static void main(String[] args) 
    { 
        String str = "I am a java Programmer"; 
        count(str); 
    } 
} 





4.class string1
{
  public static void main(String[]args)
  {
    String s = "aaabbbc";
    try
    {
       for(int i=0;i<s.length();i=i+3)
       {
       
           if(s.charAt(i)==s.charAt(i+1)&&s.charAt(i)==s.charAt(i+2))
           {
                System.out.println("True");
           }else
           {
               System.out.println("false");
         
           }
            if(i==s.length()-1 && i==s.length()-2)
            {
           
              System.out.println("invalid input");
               break;
           } 
       }
    }
    catch (Exception e)
    {
      System.out.println("false");
    }
  }
}



5.import java.util.*;
class string1
{
  public static void main(String args[])
  {
    String original, reverse = "";
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a string to reverse");
    original = in.nextLine();

    int length = original.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + original.charAt(i);

    System.out.println("Reverse of the string: " + reverse);
  }
}
     


6.class changecase
{ 
        
     static void convertOpposite(StringBuffer str) 
     { 
        int ln = str.length(); 
             
        for (int i=0; i<ln; i++) 
        { 
            Character c = str.charAt(i); 
            if (Character.isLowerCase(c)) 
                str.replace(i, i+1, Character.toUpperCase(c)+""); 
            else
                str.replace(i, i+1, Character.toLowerCase(c)+""); 
             
        } 
     } 
       
     public static void main(String[] args)  
     { 
         StringBuffer str = new StringBuffer("PrabHanshU"); 
         convertOpposite(str); 
           
         System.out.println(str); 
        } 
 } 














 

        
     