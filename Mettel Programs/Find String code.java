//Find String code

int sum=0,sum1=0;
char c1,c2;
String small=new string([a-z]);
String caps=new String([A-Z]);
String s[]=input1.split("");
String res=new String(" ");
for(i=0;i<s.length;i++)
{
System.out.println(s[i]);
for(i=0;i<s.length;i++)
{
System.out.println(s[i]);
if(s[i].length()%2==0)
{
for(j=0;j<s[i].length()/2;i++)
}
c1=s[i].charAt(j);
c2=s[i].charAt(s[i].length()-j-1);
System.out.println(c1+" "+c2);
if(Character.isLowerCase(c1))
i1=small.indexOf(c1)+1;
else
i1=cap.indexOf(c2)+1;
System.out.println(i1);
if(Character.isLowerCase(c2))
i2=small.indexOf(c2))+1;
else
i2=cap.indexOf(c2)+1;
System.out.println(i2);
sum=i1-i2;
sum1+=Math.abs(sum);
}
}
else
{
for(j=0;j<s[i].length()/2)
{
c1=s[i].charAt(j);
c2=s[i].charAt(s[i].length()-j-1);
if(Character.isLowerCase(c1))
i1=small.indexOf(c1)+1;
else
i1=cap.indexOf(c1)+1;
if(Character.isLowerCase(c2))
i2=small.indexOf(c2)+1;
System.out.println(i2);
sum=i1-i2;
sum1+=Math.abs(sum);
}
char c3=s[i].charAt(s[i].length()/2);
if(Character.isLowerCase(c3))
sum1+=small.indexOf(c3)+1;
else
sum1+=cap.indexOf(c3)+1;
}
System.out.println(sum1);
String s1=String.valueOf(sum1);
res+=s1;
sum1=0;
}
System.out.println(res);
int r=Integer.parseInt(res);
return r;
}

