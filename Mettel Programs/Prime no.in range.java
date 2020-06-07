//Prime number in range

int k=2;
int d=input1,i,c=0;
int prime=0;
int count=0;
while(d<=input2)
{
for(i=2;i<d;i++)
{
if(d%i==0)
c++;
}
}
if(c==0)
{
count++;
System.out.println(d);
}
d++;
c=0;
}
return cpunt;
}
