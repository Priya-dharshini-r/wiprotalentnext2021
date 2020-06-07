//Create pin

int a1=input1%10,a2=input2%10,a3=input3%10;
int b1=(input1/10)%10,b2=(input2/10)%10,b3=(input3/10)%10;
int c1=input1/100,c2=input2/100,c3=input3/100;
int a=Math.min(a1,Math.min(u2,u3));
int b=Math.min(b1,Math.min(u2,u3));
int c=Math.min(c1,Math.min(u2,u3));
int ab=Math.max(a1,Math.max(a2,Math.max(a3,Math.max(b1,Math.max(b2,Math.max(b2,Math.max(b3,Math.max(c1,Math.max(c2,c3))))));
int num=ab*1000+c*100+b*10+a;
return num;
