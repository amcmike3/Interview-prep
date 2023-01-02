package com.mcmichael.concepts.binarytrees;

import com.mcmichael.concepts.stacksandqueues.QueUnderflowException;
import com.mcmichael.concepts.stacksandqueues.Queue;
import com.mcmichael.concepts.stacksandqueues.QueueOverFlowException;

public class BreadthFirstTraversal {
	public void breadthFirst(TreeNode root) throws QueueOverFlowException, QueUnderflowException{
		if (root == null) {
			return;
		}
		Queue<TreeNode> queue = new Queue();
		queue.enqueue(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.dequeue();
			System.out.println(node);
			 if (node.getLeftChild() != null) {
				 queue.enqueue(node.getLeftChild());
			 }
			 if (node.getRightChild() != null) {
				 queue.enqueue(node.getRightChild());
			 }
			
			
		}
	}

}
