//Sum of digit

int sum=0;
while(input1!=0)
{
sum=sum+input1%10;
input1=input1/10;
}
return sum;
