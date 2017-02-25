import org.junit.Test;

public class A
{
	//we covered equals,contains , parseInt,parseDouble,split,replace
	
	public int hi(String s,String s1)
	{
		return s.compareTo(s1);
	}
	
	@Test
	public void demo()
	{
		/*There are two way we can declare String variable:
			1.String t="hello";
	        2.String t1=new String("Hi");
	        String is immutable class which means can not change the value for particular reference
	        *
	        */
		//System.out.println(hi("cat","ant"));
		//To compare between two String either equals or not
		String name="Whats up";
		String name1="How u doing";
		name.equals(name1);//equals method return boolean data type
		boolean result=name.equals(name1);
		System.out.println(result);
		//or we can do like this
		if(name.equals(name1))
		{
			System.out.println(" result matched");
		}else
			System.out.println("not matched");
		
		//to check a string is contain into another string or not
		String name2="Whats up";
		String name3="How u doing";
		name2.contains(name3);//equals method return boolean data type
		boolean result1=name.contains(name1);
		System.out.println(result);
		//or we can do like this
		if(name2.contains(name3))
		{
			System.out.println(" result matched");
		}else
			System.out.println("not matched");
		
		//to replace any string to another string
		
		name3.replace("doing", "came");//it willchange name3 reference
		//it could be anything in a string

		//to divided a String
		name3.split(" ");//parameter takes regular expression based on this it will divided
		//which return String[] data type
		String[] result3=name3.split(" ");
		//to see the result
		for(String r:result3)
		{
			System.out.println(r);
		}
		//to get value by index
		System.out.println(result3[0]);
		
		//to parse a string value to int value
		int pa=Integer.parseInt("12");//it will return int value
		//same way if u want to parse into double
		double d=Double.parseDouble("13.9");//it will return double value
		
		//one example using above method
		//Question: let say u have a string which is "12sd32" .to manupulate this string
		 //i want result 44.
		//Ans:
			String e="12sd32";
			String e1=e.replace("sd", ",");//first remove sd with ,
			String[] s1=e1.split(",");//to seperate 12 and 32 
		     //now s1[0]="12" and s1[1]="32"
			//now we have to convert from string to int in order to add
			int re=Integer.parseInt(s1[0]);//which is 12
			int re2=Integer.parseInt(s1[1]);//which is 32
		System.out.println(re+re2);//which will print 44
		
		//to find length of string
		String s="how are you";
		System.out.println(s.length());
		
		// to change to uppercase
		System.out.println(s.toUpperCase());
		
		//to change to lower case
		s.toLowerCase();
		
		// to remove white spacing
		System.out.println(s.trim());
		
		// to compare between two string based on alphabatic order
		System.out.println("jack".compareTo("how"));//if first character is bigger than second it return 1
		//if not it return -1 and for equal it return 0
		
		// to check a string start with what and end with
		System.out.println(s.endsWith("you"));
		System.out.println(s.startsWith("how"));
		
		//to compare two string or object are equals or not based on hashcode method
		//difference between equals and hashcode metho is
		//if string is different hashcode could be same or different
		//but string is same hashcode is always same
		//with different string which has same hashcode value
		System.out.println("FB".hashCode());
		System.out.println("Ea".hashCode());
		//if same string hashcode always will be same
		System.out.println("cat".hashCode());
		System.out.println("cat".hashCode());
		
		//to check whether string is null or not
		System.out.println(s.isEmpty());
		System.out.println("".isEmpty());
		
		//to find second last same character occured in string 
		System.out.println(s.lastIndexOf('o'));
		int z=s.lastIndexOf('o');//last character
		System.out.println(s.lastIndexOf('o', z-1));//second last,one less than last index number of 'o'
		int z1=s.lastIndexOf('o', z-1);
		System.out.println(s.charAt(z1));//to see character only
		
		//
		//String g="hello";
				//System.out.println(g.valueOf("o"));
			System.out.println("Hello".valueOf('o'));
			
			//to check second occured character from start in string
				String s3="united state of america";
				int c=s3.indexOf('a');
				int c3=s3.indexOf('a', c+1);
				System.out.println(s3.charAt(c3));
				
		// to join two string based on barriar
			System.out.println(s.join(" ", "dado","hi"));
				
		//to get substring from string
			System.out.println(s3.substring(7));//parameter is starting index
			System.out.println(s3.substring(7,12));//parameter is starting and ending index
			
			//How to reverse a string
			char[] ar=s.toCharArray();//to convert a string to char array
			for(int i=ar.length-1;i>=0;i--)//index start with last index
			{
				System.out.print(ar[i]);//print
			}
			
			//to get index nuber from a string
			//int c2=s3.indexOf('a', );
			//System.out.println(c3);
			
			//to get a character from a string
			System.out.println(s3.charAt(c3));
			System.out.println(c);
//			
			//reverse a string without space
			String s4=s.replace(" ", "");
//			for(int i=0;i<s4.length();i++)
//			{
//				System.out.println(s4.charAt(i));
//			}
//				
			
			
		StringBuffer sb=new StringBuffer("hi");//is syncronized
		sb.toString().contains("hello");//to convert stringbuffer to string
		
		//implementation for + , concate and append method to add string
		System.out.println("the true result is "+20);//with + can be add string and int
		System.out.println(s.concat(""));//only between two string from string class
		System.out.println(sb.append("whats up"));//only add string from stringbuffer class
		
		StringBuilder sd=new StringBuilder("hgdf");//is not syncronized
		StringBuffer sb1=new StringBuffer("how");
		
		//using built in method reverse a string
		System.out.println(sb1.reverse().toString());
		 
		
	}

}
