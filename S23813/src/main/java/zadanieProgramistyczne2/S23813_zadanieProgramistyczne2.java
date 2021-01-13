package zadanieProgramistyczne2;

import java.util.ArrayList;
import java.util.List;

public class S23813_zadanieProgramistyczne2 {

	public static void main(String[] args) {

		Node<String> parent = new Node<String>("A", 2);
		Node<String> child1 = parent.addChild(new Node<String>("B",10));
		Node<String> child2 = parent.addChild(new Node<String>("C", 12));
		Node<String> child3 = parent.addChild(new Node<String>("D", 7));
		Node<String> child11 = child1.addChild(new Node<String>("E", 3));
		Node<String> child31 = child3.addChild(new Node<String>("F", 5));
		Node<String> child32 = child3.addChild(new Node<String>("G", 9));

		System.out.println(parent.getName() +" "+ parent.getWeight());
		System.out.println(child1.getName() +" "+ child1.getWeight());
		System.out.println(child31.getName() +" "+ child31.getWeight());

	}
}

class Node<T> {

	private T name;
	private int weight;
	private List<Node<T>> children = new ArrayList<>();
	private Node<T> parent = null;

	public Node(T name, int weight) {
		this.name=name;
		this.weight=weight;
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

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name=name;
	}

	public int getWeight() {
		return weight;
	}
}

