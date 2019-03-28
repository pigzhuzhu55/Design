#工厂方法模式写法，以及讲解

- 工厂方法模式
- 去掉了简单工厂模式中工厂方法create的静态属性，使得它可以被子类继承,进而决定实例化哪一个类
- 优点：可以一定程度上解耦，消费者和产品实现类隔离开
- ![UML示意图](https://github.com/pigzhuzhu55/Design/blob/master/src/example/factory/method/11.png?raw=true)
