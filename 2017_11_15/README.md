## 小结

- 函数的值传递和引用传递：http://www.cnblogs.com/taixuyingcai/p/6373423.html

        函数参数传递其实是一个赋值的过程，基本类型传递的是数值，引用类型传递的引用对象的内存地址。
        另外一点要特别注意，函数的参数其实是函数内部的局部变量。不要跟外部变量混淆
        
        
        
- JS伸缩菜单的实现
    
      思路：
        1、通过var pObjs = document.getElementsByTagName("p")获取所有p元素，返回类型是数组类型。
        2、遍历pObjs[],并为每个pObjs添加i标记，表示该pObjs是第几个p
        3、为每个p标签设置onclick事件
        4、根据之前p设置的index标记可以获取该p标签下的ul对象，控制其显示或隐藏。
        
        “document.getElementsByTagName”不仅仅可以使用document，还可以使用别的元素对象，
        例如：
            //获取第一个ul下的所有li
            var ulObjs = document.getElementsByTagName("ul");
            var a = ulObjs[0].getElementsByTagName("li");