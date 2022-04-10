package principle.lod;

/**
 * <p>The class Case1 was created on 2022/4/10.</p>
 * <p>
 * TODO
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case2 {

    static class Mediator {

    }

    static class Button {
        public void click() {
            System.out.println("Button click");
        }
    }

    static class List {
        public void change() {
            System.out.println("List change");
        }
    }

    static class Label {
        public void change() {
            System.out.println("Label change");
        }
    }

    static class TextBox {
        public void change() {
            System.out.println("TextBox change");
        }
    }

    static class ComboBox {
        public void change() {
            System.out.println("ComboBox change");
        }
    }

}
