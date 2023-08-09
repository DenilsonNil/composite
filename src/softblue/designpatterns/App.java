package softblue.designpatterns;

public class App {

    public static void main(String[] args) {

        //Este grupo agrupa em uma lista através do método add outros grupos e leafs
        SceneGroup group1 = new SceneGroup();

        Triangle t1 = new Triangle();
        SceneGroup group2 = new SceneGroup();

        group1.add(t1);
        group1.add(group2);

        Triangle t2 = new Triangle();
        Rectangle r1 = new Rectangle();

        group2.add(t2);
        group2.add(r1);

        SceneGroup group3 = new SceneGroup();

        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        group3.add(r2);
        group3.add(r3);

        group2.add(group3);

        //Esta chamada dispara uma chamada em cadeia para os filhos (componentes que estão na lista)
        group1.draw();
    }
}
