package zadanieProgramistyczne2;

import java.util.ArrayList;
import java.util.List;

public class S23813_zadanieProgramistyczne2 {

	public static void main(String[] args) {


		Node<String> parent = new Node<String>("A");
		Node<String> child1 = parent.addChild(new Node<String>("B"));
		Node<String> child2 = parent.addChild(new Node<String>("C"));
		Node<String> child3 = parent.addChild(new Node<String>("D"));
		Node<String> child11 = child1.addChild(new Node<String>("E"));
		Node<String> child31 = child3.addChild(new Node<String>("F"));
		Node<String> child32 = child3.addChild(new Node<String>("G"));

		System.out.println(parent.getData());
		System.out.println(child1.getData());
		System.out.println(child31.getData());


	}
}

class Node<T> {

	private T data = null;
	private List<Node<T>> children = new ArrayList<>();
	private Node<T> parent = null;

	public Node(T data) {
		this.data=data;
	}
	public Node<T> addChild(Node<T> child) {
		child.setParent(this);
		this.children.add(child);
		return child;
	}

	public void addChildren(List<Node<T>> children) {
		children.forEach(each -> each.setParent(this));
		this.children.addAll(children);
	}

	public void setParent(Node<T> parent) {
		this.parent=parent;
	}

	public List<Node<T>> getChildren() {
		return children;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data=data;
	}
}

