# 命令模式写法，以及讲解

- 命令模式
- 以命令的方式，解耦调用者与功能的具体实现者，降低系统耦合度，提供灵活性

- 应用实例：struts 1 中的 action 核心控制器 ActionServlet 只有一个，相当于 Invoker，而模型层的类会随着不同的应用有不同的模型类，相当于具体的 Command。

- 优点： 1、降低了系统耦合度。 2、新的命令可以很容易添加到系统中去。

- 缺点：使用命令模式可能会导致某些系统有过多的具体命令类。

- 使用场景：认为是命令的地方都可以使用命令模式，比如： 1、GUI 中每一个按钮都是一条命令。 2、模拟 CMD。
- ![UML示意图](https://github.com/pigzhuzhu55/Design/blob/master/src/example/command/6.svg)