import java.io.*;
import java.util.*;
class Convert
{ int n,s;
  Scanner sc=new Scanner(System.in);
  Convert()
  { n=0;
      s=0;
  }
  void inpnum()
  { n=sc.nextInt();
      while(n>0)
      {
          s=(s*10)+(n%10);
          n=n/10;
        }
        n=s;
    extdigit(n);
  }
  void extdigit(int n)
  { if(n<=0)
      return;
    else
      { num_to_words(n%10);
        extdigit(n/10);
      }
  }
  void num_to_words(int x)
  { String a[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    System.out.print(a[x]);
  }
  public static void main()
  { Convert c=new Convert();
    c.inpnum();
         }
}
          