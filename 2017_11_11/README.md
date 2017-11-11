## 小结 

- String、StringBuffer、StringBuilder

        String是字符串常量，不可更改。
        StringBuffer、StringBuilder是字符串变量,可以进行扩充和修改
        
        StringBuffer  线程同步    安全   效率低 建议多线程时用
        StringBuilder 线程不同步  不安全 效率高 建议单线程用
        
        equals方法：
            String重写了equals方法，所以String的equals比较的是值
            StringBuffer、StringBuilder未重写euqals方法，所以它们使用的是父类Object的equals方法，
          而Object的equals()比较的是对象的地址。
          
          注意：只要重写了equals()，必须重写hashcode().
                
               总结一句话：等价的(调用equals返回true)对象必须产生相同的散列码。不等价的对象，不要求产生的散列码不相同。
        
        