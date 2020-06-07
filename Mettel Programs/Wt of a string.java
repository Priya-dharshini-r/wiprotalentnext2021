//Weight of a string

String small="abcdefghijklmnopqrstuvwxyz";
int sum=0,i;
for(i=0;i<input1.length();i++)
{
if(input2==0)
{
char c=input1.charAt(i);
if(Character.isUpperCase(c))c=Character.toLowerCase(c);
if(c!='a&&c!='e'&&c!='i'&&c!='o'c!='u')
{
int index=small.indexOf(c);
if(index>=0)
sum=sum+index+1;
}
else
{
sum=sum+0;
}
else
{
char s=input1.charAt(i);
if(Character.isUpperCse(c))
  c=Character.toLowerCase(c);
  int index=small.indexOf(c);
  if(index>=0)
  sum=sum+index+1;
  else
  sum=sum+0;
  }
  }
  return sum;
