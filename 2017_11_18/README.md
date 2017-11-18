## 继承(减少重复代码) 
      
- ☆☆☆  

    父类中的变量被子类继承,但不是全部，有特殊情况。

- super

        super必须放在第一行！
        
        1.如果子类的构造函数，没有显示的写super(),那么它会自动的调用父类的默认无参构造函数，但父类
         必须有默认无参构造函数。
         
        2.如果父类显示的提供了构造函数，那么子类的构造函数必须依赖父类显示的提供的构造函数。
         super(具体的父类的参数列表)
         
        注意：
            this();
            super();
            在构造函数中，this关键字也必须放在第一行，所以this与super不可共存！
                 
- 动态绑定(运行时多态,Spring)

        动态绑定：一个父类对象指向多个子类
        
        例如：
         Dog extends Animal
         Cat extends Animal
         
         Animal  animal = null;
         animal = new Dog();
         animal = new Cat();
         
         
         若要区分animal到底是什么，需要使用 instanceof 来判断
         
         if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHouse();
         }
         
         if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMice();
         }
         