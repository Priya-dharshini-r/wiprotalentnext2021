//prime number or not

int count=0;
for(int i=0;i<input1;i++)
{
if(input1%i==0)
count++;
}
if(count==0)
return 2;
else
return 1;
