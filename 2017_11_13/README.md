## 小结 

- Java中的变量从作用域来分：全局变量和局部变量
- 静态变量 也叫做类变量
- 非静态变量，也叫实例变量，是属于每一个实例的变量，即每次new的时候都会创建一份

        在方法中是不能够定义静态变量，静态变量是类变量，是这个类的，而不是属于哪个方法的。
        
- 逻辑运算符
 
        注意:逻辑与和逻辑或有短路的现象。
        
- 三元运算符

        String num="";
        int pageNumber = null==num || "".equals(num) ? 1 : Integer.parseInt(num);
        System.out.println(pageNumber);
        
        注意：null==num||"".equals(num)的判断，应用场景：分页
        
- Scanner的使用
        
        //Scanner扫描器，从键盘读取输入的数据。
        Scanner scan = new Scanner(System.in);
        
        String str = scan.next();   //读取字符串
        int age = scan.nextInt();   //读取一个整数
                                      ...float,double
                                      
- switch分支语句
    
        ☆注意：JDK1.6和以下的swict语句(),只能是byte short int  char类型进行分支判断
        
- 增强for
        
        ☆注意：JDK1.4和以下，无法使用增强for循环
        
- 获取代码运行时间

        long startTime = System.currentTimeMillis();
        ...
        long endTime = System.currentTimeMillis();
        
        long time = endTime - startTime;