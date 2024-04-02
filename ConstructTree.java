import java.util.*;
public class ConstructTree{
public static TreeNode function(int [] preorder,int [] inorder,int inst,int ined,int prest,int preed,HashMap<Integer,Integer> map){
        if(inst>ined || prest>preed) return null;
        TreeNode newNode =new TreeNode(preorder[prest]);
        int index=map.get(preorder[prest]);
        int noofele=index-inst;
        newNode.left=function(preorder,inorder,inst,index-1,prest+1,preed+noofele,map);
        newNode.right=function(preorder,inorder,index+1,ined,prest+noofele+1,preed,map);
        return newNode;
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return function(preorder,inorder,0,inorder.length-1,0,preorder.length-1,map);
    }
    public static void main(String args[] ){
        int[] preorder={1,2,4,5,3,6,7};
        int[] inorder={4,2,5,1,6,3,7};
        buildTree(preorder,inorder);
    }
}