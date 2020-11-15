class HollowInvertedHalfPyramid
{
  public static void main(String[]args)
  {
    for(int i=0;i<=6;i++)
    {
      for( int j=0;j<=(5-i);j++)
      {
        if(i==0)
        {
          System.out.print("*");
        }
        if(j==0 || j==5-i)
        {
           System.out.print("*");
        }
        System.out.println();
      } 
   }
}
}