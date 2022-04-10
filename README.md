# 设计模式

## 1. 面向对象设计原则

### 1.1 单一职责原则

单一职责原则（Single Responsibility Principle，SRP）：一个类只负责一个功能领域中的相应职责，或者就一个类而言，应该只有一个引起它的变化。

现有一个CustomerDataChart客户信息图表类，getConnection()方法获取数据库连接，findCustomers()方法从数据库查找客户信息，createChart()方法创建图表，displayChart()方法显示图表。

![case1](img/principle/srp/case1.png)

利用单一职责原则对CustomerDataChart进行拆分：DBUtil类负责数据库连接，CustomerDAO扶着数据库数据查询，CustomerDataChart类负责创建图表和显示图表。

![case2](img/principle/srp/case2.png)

### 1.2 开闭原则

开闭原则（Open-Closed Principle，OCP）：一个软件实体对拓展开放，对修改关闭。即软件实体应该在尽量不修改原有代码的情况下进行拓展。
在开闭原则中，软件实体可以指一个软件模块、一个由多个类组成的局部结构、一个独立的类。

现有一个可以显示各类图表的类ChartDisplay，另外有用于显示柱状图(BarChart)和饼状图(PieChart)类

![case1](img/principle/ocp/case1.png)

进行重构使之符合开闭原则：AbstractChart抽象图表类，各种具体类型图表则作为其子类；ChartDisplay类针对抽象图表进行编程，由客户端来决定使用具体的图表。

![case2](img/principle/ocp/case2.png)

### 1.3 里氏替换原则

里氏替换原则（Likov Substitution Principle，LSP）：所有引用基类（父类）的地方必须能透明地使用其子类的对象。

现有普通客户类CommonCustomer和VIP客户类VIPCustomer，和一个EmailSender邮件发送类

![case1](img/principle/lsp/case1.png)

根据里氏替换原则重构：增加客户抽象类Customer，CommonCustomer和VIPCustomer继承自Customer，EmailSender发送邮件的方法只需要是Customer方法，因为能使用父类的地方，子类必须能透明地使用。

![case2](img/principle/lsp/case2.png)

### 1.4 依赖倒转原则

依赖倒转原则（Dependency Inversion Principle，DIP）：抽象不应该依赖于细节，细节应当依赖于抽象。即针对接口编程，而不是针对实现编程。

依赖倒转原则要求在程序中传递参数时或者关联关系中，尽量引用层次高的抽象类，即使用接口和抽象类进行变量类型声明、参数类型声明、方法返回类型声明。

在实现依赖倒转原则时，会通过依赖注入的方式注入到其它对象中。依赖注入（Dependency Injection，DI）是将一个对象引用到声明的抽象类，常用的注入方式有：构造注入、设值注入、接口注入。

现有Txt文件读取数据类TXTDataConvertor和Excel读取数据类ExcelDataConvertor，持久类CustomerDAO。

![case1](img/principle/dip/case1.png)

根据依赖倒转原则：增加抽象类DataConvertor，TXTDataConvertor和ExcelDataConvertor继承自DataConvertor，CustomerDAO依赖于抽象类，则可根据具体实现选择转换类。

![case1](img/principle/dip/case2.png)

### 1.5 接口隔离原则

接口隔离原则（Interface Segregation Principle，ISP）：使用多个专门的接口，而不使用单一的总接口，即客户端不应该依赖那些它不需要的接口。

现有接口ConcreteClass有5个方法，其实现类CustomerDataDisplay，客户端Client使用接口，实际发现CustomerDataDisplay有可能只需要其中某几个方法，而其他的方法不需要。

![case1](img/principle/isp/case1.png)

根据接口隔离原则：将ConcreteClass拆分成4个接口DataHandler、XmlTransformer、ChartHandler、ReportHandler，实现类ConcreteClass可根据自身需求选择实现的接口。

![case1](img/principle/isp/case2.png)

### 1.6 迪米特法则

迪米特法则（Law of Demeter，LoD）：一个软件实体应该尽可能少的地与其他实体发生相互作用。
迪米特法则也被定义为：不要和陌生人说话、只与直接朋友通信。在迪米特法则中，朋友包括：
1. 当前对象本身（this）
2. 以参数形式传入当前对象方法中的对象
3. 当前对象的成员变量
4. 当前对象所创建的对象
5. 当前对象的成员变量是集合，那集合中的元素也是朋友

现有一个Button控件，点击Button时，List、ComboBox、TextBox、Label都会做出改变，关系如下图：

![case1](img/principle/lod/case1.png)

经由迪米特法则修改：引入一个Mediator中间类降低组件之间的耦合度，控件之间不发生直接引用，而是将请求先转发给中间类，再由中间类完成其它组件的调用

![case2](img/principle/lod/case2.png)

### 1.7 合成复用原则

合成复用原则（Composition Reuse Principle，CRP）：尽量使用对象组合，而不是通过继承达到复用的目的。

现有数据库连接工具类DBUtil，客户持久类CustomerDAO，CustomerDAO通过继承DBUtil的方式复用连接数据库的代码。

![case1](img/principle/crp/case1.png)

由合成复用原则改进：DBUtil作为基类，分别有OracleDBUtil和MysqlDBUtil继承自DBUtil，CustomerDAO通过注入DBUtil的方式完成代码的复用。

![case1](img/principle/crp/case2.png)

## 2. 简单工厂模式

### 2.1 案例

有一个Chart图表类用于创建和显示各类图表，如饼状图、柱状图、折线图等。

![case1](img/simplefactory/case1.png)

从类图中可以看出Chart类的职责很多，且当需要拓展一种图表时，调用方和被调用方都需要修改源代码，不符合开闭原则。

### 2.2 定义

简单工厂模式（Simple Factory Pattern）：定义一个工厂类，它可以根据不同的参数返回不同类的实例，被创建的实例通常继承自同一个父类，简单工厂模式通常用静态方法创建实例，所以也被称为静态工厂方法模式。

### 2.3 类图

![case1](img/simplefactory/case2.png)

### 2.4 说明

1. Factory（工厂角色）：工厂类，负责实现创建所有产品实例的内部逻辑；工厂类可以被外部直接调用，创建所需的产品对象；工厂类的静态方法factoryMethod返回产品的抽象类Product。
2. Product（抽象产品角色）：工厂类创建的所有对象的父类，封装了各种产品对象的公有方法，它的引入提高了系统的灵活性，使得工厂类中只需要定义一个通用的工厂方法。
3. ConcreteProduct（具体产品角色）：简单工厂方法的创建目标，每一个具体产品类都继承自抽象产品类。

### 2.5 案例应用

![case3](img/simplefactory/case3.png)