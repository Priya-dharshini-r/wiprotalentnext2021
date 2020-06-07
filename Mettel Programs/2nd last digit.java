//second last digit

if(input1<0)
{
input1=(-1)*input1;
int c=0;
int l=Integer.Tostring(input1).length();
int r=0;
if(l==1)
return -1;
else
{
while(input1>0)
{
r=input1%10;
c++;
input1/=10;
if(c==2)
break;
}
return r;
}
}
