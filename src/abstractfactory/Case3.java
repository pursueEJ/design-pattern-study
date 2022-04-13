package abstractfactory;

/**
 * <p>The class Case3 was created on 2022/4/13.</p>
 * <p>
 * TODO
 * </p>
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case3 {
    public static void main(String[] args) {
        Factory factory = new SummerFactory();
        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        ComboBox comboBox = factory.createComboBox();

        button.display();
        textField.display();
        comboBox.display();

    }

    interface Button {
        void display();
    }
    static class SpringButton implements Button {
        @Override
        public void display() {
            System.out.println("SpringButton");
        }
    }
    static class SummerButton implements Button {
        @Override
        public void display() {
            System.out.println("SummerButton");
        }
    }

    interface TextField {
        void display();
    }
    static class SpringTextField implements TextField {
        @Override
        public void display() {
            System.out.println("SpringTextField");
        }
    }
    static class SummerTextField implements TextField {
        @Override
        public void display() {
            System.out.println("SummerTextField");
        }
    }

    interface ComboBox {
        void display();
    }
    static class SpringComboBox implements ComboBox {
        @Override
        public void display() {
            System.out.println("SpringComboBox");
        }
    }
    static class SummerComboBox implements ComboBox {
        @Override
        public void display() {
            System.out.println("SummerComboBox");
        }
    }

    interface Factory {
        Button createButton();
        TextField createTextField();
        ComboBox createComboBox();
    }
    static class SpringFactory implements Factory {
        @Override
        public Button createButton() {
            return new SpringButton();
        }

        @Override
        public TextField createTextField() {
            return new SpringTextField();
        }

        @Override
        public ComboBox createComboBox() {
            return new SpringComboBox();
        }
    }
    static class SummerFactory implements Factory {
        @Override
        public Button createButton() {
            return new SummerButton();
        }

        @Override
        public TextField createTextField() {
            return new SummerTextField();
        }

        @Override
        public ComboBox createComboBox() {
            return new SummerComboBox();
        }
    }


}
