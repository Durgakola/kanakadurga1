package demopackage;

import java.util.ArrayList;
import java.util.List;

public class NodeTest {

    public static void main(String[] args) {
        Node a = new Node();
        List<Node> achild = new ArrayList<>();
        a.name = "A";
        Node b = new Node();
        b.name="B";
        Node c = new Node();
        c.name="C";

        achild.add(b);
        achild.add(c);
        a.child=achild;



        List<Node> bchild=new ArrayList<>();
        b.name="B";
        Node d=new Node();
        d.name="D";
        Node e=new Node();
        e.name="E";

        bchild.add(d);
        bchild.add(e);
        b.child=bchild;



        List<Node> cchild=new ArrayList<>();
        c.name="C";
        Node f=new Node();
        f.name="F";
        Node g=new Node();
        g.name="G";

        cchild.add(f);
        cchild.add(g);
        c.child=cchild;



        List<Node> dchild=new ArrayList<>();
        d.name="D";
        Node h=new Node();
        h.name="H";
        Node i=new Node();
        i.name="I";

        cchild.add(h);
        cchild.add(i);
        d.child=dchild;



        List<Node> echild=new ArrayList<>();
        e.name="E";
        Node j=new Node();
        j.name="J";
        Node k=new Node();
        k.name="K";

        echild.add(j);
        echild.add(k);
        e.child=echild;

        System.out.println(e);


    }
}
