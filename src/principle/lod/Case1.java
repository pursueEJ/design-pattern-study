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
public class Case1 {

    static class Button {
        public void click() {
            new List().change();
            new Label().change();
            new TextBox().change();
            new ComboBox().change();
        }
    }

    static class List {
        public void change() {
            System.out.println("List change");
            new TextBox().change();
            new ComboBox().change();
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
