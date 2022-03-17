import java.io.*;
public class Myclass
{
	
        public static void main(String args[])throws Exception
		{
                int n=(int)(Math.random()*(26-1)+1);
                PrintWriter outFile = new PrintWriter(new BufferedWriter(new FileWriter("./Output.txt"))) ;
                int b=(n-1)*2;
                char a;
                String s1="",s2="";
                for(int c=1;c<=n;c++)
                {
                        a=(char)(c+97-1);
                        s2=a+s2;
                        s1=s1+a;
                        System.out.print(s1);
                        outFile.print(s1);
                        for(int z=1;z<=b;z++)
                        {
                        	System.out.print(" ");
                        	outFile.print(" ");
                        }
                        System.out.print(s2);
                        outFile.print(s2);
                        System.out.println();
                        outFile.println();
                       b-=2;
                }
                outFile.close( );
		}
}
