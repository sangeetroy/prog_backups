import java.util.*;
public class FunctionPalindromePrime
{
Scanner sc = new Scanner(System.in);
int i,j,k,s=0,f,m,d,p;
void input()
{
System.out.println("Give Number To Check For Palindrome,Prime Or Not");
j = sc.nextInt();
if(check(j)==1 && primecheck(j)==1)
System.out.println("Palindrom & Prime"+j);
else
System.out.println(" Non Palindrom & Prime"+j);
}
int check(int j)
{
i=j;
s=0;
while(j>0)
{
k = j%10;
s = (s*10)+k;
j = j/10;
}
if(i==s)
{
return(1);
}
else
return(0);
}
int primecheck(int i)
{
int f=0;
for(k=2;k<i;k++)
{
if(i%k==0)
{
f=1;
break;
}
}
if(f==0)
return 1;
else
return 0;
}
}