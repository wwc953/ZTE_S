## JS

    undefined:声明了变量，但未赋值
    NaN是非数字值，属于number类型
    null对象 null值 undefined
    

    var a=10;
    var b="10";
    区别：
        == 和 != 比较若类型不同，先偿试转换类型，再作值比较，最后返回值比较结果 。
        而
        === 和 !== 只有在相同类型下,才会比较其值。

    input：placeholder，autofocus，onblur="checkName(this)"//onblur对象失去焦点
    button：onclick="btn_click()"，onmouseout="btn_out(this)"，onmouseover="btn_over(this)"
   
    //按键事件
    document.onkeydown=key_down;			
    function key_down(event)
    {
	    var  codeValue=event.keyCode;
				
	    switch(){
		    ...
	    }
    }


    window.prompt：用于显示可提示用户进行输入的对话框,返回用户输入的字符串
    window.location.href="index.html";//location内置对象,href链接到目标页面


    Number()：把对象的值转换为数字
    Boolean()：如果省略 value 参数，或者设置为 0、-0、null、""、false、undefined 或 NaN，则该对象设置为 false。否则设置为 true（即使 value 参数是字符串 "false"）。
    isNaN()：判断其参数是否是 NaN，该值表示一个非法的数字
    arguments：

    //本地缓存
    localStorage：localStorage.setItem(key,value);localStorage.getItem(key);localStorage.removeItem(key);
    sessionStorage：//会话缓存


    数组	var a=[1,2,3,true,5,6,7,8,9];
    for增强语句	for(var j in a)


    console.time()：启动计时器
    console.timeEnd()：停止计时，输出时间
    console.log()：控制台打印


    json分为两种:
	    jsonObject  json对象 {}
	    jsonArray   json数组 []

    js中的return关键字是用在函数体内，意思返回，余下的不执行。



    <!--下拉选择框  this写在哪个标签中，就是代表哪个标签对象-->
    <select id="selectCitys" name="citys" onchange="getCityValue(this)">


    innerHTML
    下拉选择框，动态添加数据


    +在js中是个特殊的运算符
    +是个重载运算符，同一个名字，不同的表现形式
    1.如果是执行加法，只要有一个是字符串，那么执行的就是连接。
    2.如果是非字符串类型，执行的就是加法运算。

    任何一个类型和字符串类型执行相加，都是连接。


    window.setTimeout("aa()",2000);//2秒后执行aa函数，只执行一次
    window.setInterval("aa()",2000);//每2秒执行aa函数


    Math.random()*value：这个随机数0<=随机数<value
    Math.floor(index)：取整


    js 探知及数据类型的关键字为 typeof
    JavaScript数据类型
    1.值类型  
        number(数值)
        string(字符串)
        boolean(布尔类型)
        undefine(未定义类型)：声明了变量但没有赋值
        function(函数类型)
  
    2.引用类型
        object类型
        Date  Math  Array

