class swapwithoutthirdvariable
{
    public static void main ( int a , int b )
    {
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println ( a ) ; 
        System.out.println ( b ) ;
    }
}