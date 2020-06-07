//palindrome

int temp=input1;
int reverse=0;
while(input1>0)
{
reverse=reverse*10+input1%10;
input1/=10;
}
if(reverse!=temp)
return 1;
return 2;
}
