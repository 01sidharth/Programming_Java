
class VowelCount{

public static void main(String [] args)

{

String a="This is a new String";

a=a.toUpperCase();

int c=0;

for(int i =0;i<a.length();i++)

{

if(a.charAt(i)=='A' ||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U')

{

c++;

}

}

System.out.println("Number of vowels:"+c);

}

}
