import java.io.*;
import java.util.*;

public class Solution {
 static class BinaryTree {
   Node root;
   public BinaryTree(){
   root = null;
   }
   
  class Node {
   int value;
   int count;
   Node left;
   Node right;

   public Node(int value) {
    this.value = value;
    count = 1;
    left = right = null;
   }
  }
  public int insert(int value){
    Node branch = null;
    Node node = root;
    int count = 0;
    boolean greater = false;
    while(node != null){
      branch = node;
      greater = value >= node.value;
      if(greater){
        node = branch.right;
        count += branch.count;
      } 
      else {
        node = branch.left;
        branch.count++;
      }
    }
    if(branch == null)
      root = new Node(value);
    else if(greater){
      branch.right = new Node(value);
    } 
    else {
      branch.left = new Node(value);
    }
    return count;
  }
   
 }

 public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  int input = keyboard.nextInt();
  BinaryTree tree = new BinaryTree();
  for (int i = 0; i < input; i++) {
   int value = keyboard.nextInt();
   int greeters = tree.insert(value);
   System.out.println(greeters);
  }
 }
}
