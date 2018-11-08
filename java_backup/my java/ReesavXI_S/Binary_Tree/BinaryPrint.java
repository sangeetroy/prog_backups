package Binary_Tree;
import java.util.*;
class BinaryPrint
{
    TreeNode root;
    BinaryPrint()//default constructor
    {
        root=null;
    }
    void insert(int x)
    {
        root=insert(root,x);
    }
    TreeNode insert(TreeNode n,int x)
    {
        if(n==null)
        n=new TreeNode(x);
        else
        {
            if(x<n.getData())
            n.left=insert(n.left,x);
            else
            n.right=insert(n.right,x);
        }
        return n;
    }
    void left(TreeNode n)
    {
        if(n==null)
        return ;
        else
        {
            left(n.left);
            System.out.print(n.getData()+" ");
        }
    }
    void right(TreeNode n)
    {
        if(n==null)
        return ;
        else
        { 
            System.out.print(n.getData()+" ");
            right(n.right);
        }
    }
    void print()
    {
        left(root);
        right(root.right);
    }
}
        