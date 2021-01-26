package zadanieProgramistyczne2;

import java.util.ArrayList;
import java.util.List;

public class S23813_zadanieProgramistyczne2 {

    public static void main(String[] args) {

        int Aweight = 2;
        int Bweight = 2;
        int Cweight = 12;
        int Dweight = 7;
        int Eweight = 9;
        int Fweight = 5;
        int Gweight = 9;

        System.out.println("Input: \n");
        System.out.println(Aweight);
        System.out.println(Bweight);
        System.out.println(Cweight);
        System.out.println(Dweight);
        System.out.println(Eweight);
        System.out.println(Fweight);
        System.out.println(Gweight);

        Node<String> parent = new Node<>("A", Aweight);
        Node<String> child1 = parent.addChild(new Node<>("B", Bweight));
        Node<String> child2 = parent.addChild(new Node<>("C", Cweight));
        Node<String> child3 = parent.addChild(new Node<>("D", Dweight));
        Node<String> child11 = child1.addChild(new Node<>("E", Eweight));
        Node<String> child31 = child3.addChild(new Node<>("F", Fweight));
        Node<String> child32 = child3.addChild(new Node<>("G", Gweight));

        double result = 0;
        for (int i = 0; i < parent.getChildren().size(); i++) {
            for (int j = 0; j < parent.getChildren().get(i).getChildren().size(); j++) {
                double check = 0;
                if (parent.getChildren().get(i).getChildren().size() > 0) {
                    check = parent.getWeight() + parent.getChildren().get(i).getWeight() + parent.getChildren().get(i).getChildren().get(j).getWeight();
                    if (check > result) {
                        result = check;
                    }
                }
            }
        }
        System.out.println("\nHighest result:");
        System.out.println(result);
    }
}

class Node<T> {

    private T name;
    private int weight;
    private List<Node<T>> children = new ArrayList<>();
    private Node<T> parent = null;

    public Node(T name, int weight) {
        this.name = name;
        this.weight = weight;
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
        this.parent = parent;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "Node{" +
                "name=" + this.name + " " +
                "weight=" + this.weight + " " +
                '}';
    }
}

