
public class CountChar {
	  public static void main(String args[]) 
	  {
	      
	  String str = "aabbbcdee";
	  char ch = 'b';           //character 'b' will be search
	  
	  int count=0;
	  for(int i=0; i<str.length(); i++)
	  {
	      if(str.charAt(i) == ch)
	      count++;
	  }
	  
	  System.out.println("The Character '"+ch+"' appears "+count+" times.");
	  }
}
