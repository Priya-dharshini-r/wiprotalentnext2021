//All digit count

int c=0,r;
while(input1>0)
{
r=input1%10;
c++;
input1=input1%10;
}
return c;
}
}
