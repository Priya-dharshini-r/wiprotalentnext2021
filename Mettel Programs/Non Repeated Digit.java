//Non repeated digit

int c=0,r,i;
int h[]=new int[10];
while(input1>0)
{
r=input1%10;
h[r]++;
input1/=10;
}
for(i=0;i<10;i++)
{
if(h[i]==1)
{
c++;
}
}
return c;
}
}
