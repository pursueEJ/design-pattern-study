package create.abstractfactory;

/**
 * 抽象工厂模式案例1
 *
 * @author shonebin
 * @version 1.0.0
 */
public class Case1 {
    public static void main(String[] args) {
        ButtonFactory buttonFactory = new SpringButtonFactory();
        ComboBoxFactory comboBoxFactory = new SpringComboBoxFactory();
        TextFieldFactory textFieldFactory = new SpringTextFieldFactory();

        Button button = buttonFactory.factoryMethod();
        ComboBox comboBox = comboBoxFactory.factoryMethod();
        TextField textField = textFieldFactory.factoryMethod();
    }

    interface Button {
    }

    static class SpringButton implements Button {
    }

    static class SummerButton implements Button {
    }

    interface ButtonFactory {
        Button factoryMethod();
    }

    static class SpringButtonFactory implements ButtonFactory {
        @Override
        public Button factoryMethod() {
            return new SpringButton();
        }
    }

    static class SummerButtonFactory implements ButtonFactory {
        @Override
        public Button factoryMethod() {
            return new SummerButton();
        }
    }

    interface TextField {
    }

    static class SpringTextField implements TextField {
    }

    static class SummerTextField implements TextField {
    }

    interface TextFieldFactory {
        TextField factoryMethod();
    }

    static class SpringTextFieldFactory implements TextFieldFactory {
        @Override
        public TextField factoryMethod() {
            return new SpringTextField();
        }
    }

    static class SummerTextFieldFactory implements TextFieldFactory {
        @Override
        public TextField factoryMethod() {
            return new SummerTextField();
        }
    }

    interface ComboBox {
    }

    static class SpringComboBox implements ComboBox {
    }

    static class SummerComboBox implements ComboBox {
    }

    interface ComboBoxFactory {
        ComboBox factoryMethod();
    }

    static class SpringComboBoxFactory implements ComboBoxFactory {
        @Override
        public ComboBox factoryMethod() {
            return new SpringComboBox();
        }
    }

    static class SummerComboBoxFactory implements ComboBoxFactory {
        @Override
        public ComboBox factoryMethod() {
            return new SummerComboBox();
        }
    }

}
