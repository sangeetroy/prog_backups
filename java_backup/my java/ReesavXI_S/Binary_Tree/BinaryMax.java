package Binary_Tree;
import java.util.*;
class BinaryMax
{
    TreeNode root;
    int maxL=0; int maxR=0;
    BinaryMax()//default constructor
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
    void maxR()
    {
        find_maxR(root);
    }
    void find_maxR(TreeNode n)
    {
        if(n.left==null||n.right==null)
        return;
        else
        {
            if(n.left.getData()>maxR)
            maxR=n.left.getData();
            find_maxR(n.right);
            find_maxR(n.left);
        }
    }
    void maxL()
    {
        find_maxL(root);
    }
    void find_maxL(TreeNode n)
    {
        if(n.left==null||n.right==null)
        return;
        else
        {
            if(n.right.getData()>maxL)
            maxL=n.right.getData();
            find_maxL(n.right);
            find_maxL(n.left);
        }
    }   
    void print()
    {
        System.out.println("Maximum out of left children "+maxR);
        System.out.println("Maximum out of right children "+maxL);
    }
}