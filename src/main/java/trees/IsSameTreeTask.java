package trees;

public class IsSameTreeTask {

    public static boolean isSameTree(TNode root1, TNode root2){

        //both roots are null

      if(root1 == null && root2==null){
          return true;
      }
      if(root1==null || root2==null){
          return false;
      }
      if(root1.value != root2.value){
          return false;
      }

      boolean isLeftTrue = isSameTree(root1.leftChild, root2.leftChild);
      boolean isRightTrue = isSameTree(root1.rightChild, root2.rightChild);

      return isLeftTrue && isRightTrue;

    }






}
