//n th fibo

int a=0;
int b=1;
int c=0;
int d=3;
while(d<=input1)
{
c=a+b;
a=b;
b=c;
d++;
}
return c;
