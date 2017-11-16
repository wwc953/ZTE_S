/**
 * Created by Roll on 2017/11/16.
 */
public class Person
{
	//姓名   姓名这个变量是 属于每个对象的属性，是存放在堆内存上的。
	//作用域来说，是个全局变量，属于每个对象的，我们叫做实例变量，也可以叫做非静态变量。
	private String  name;
	private  int  age;


	//静态变量  城市名称  又叫做类变量，属于这个类，不局限于仅仅是属于哪个对象的。
	//静态变量不能定义在局部方法中，它是类变量。
	private static  String  country;


	//静态块
	static{

		//访问规则和静态方法一样
		//this.name="11";
		Person  p = new Person();
		p.name="22";
		
		//info();
		
		
		country="北京";
		
		setCountry("222");
	}


	//构造函数
	public Person()
	{
		
	}
	//构造函数 带了两个参数
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	//静态方法，也叫做类方法，是属于这个类，不局限于仅仅是属于哪个对象的。

	/**
	 * 在静态方法中是不能够直接使用实例变量，可以直接使用静态变量。
	 * 在静态方法中是不能够使用this关键字
	 *
	 * 静态变量和静态方法，我们可以通过类名.静态变量名   类名.静态方法名
	 *
	 * @param country
	 */
	public static  void  setCountry(String  country)
	{
		Person p1 = new Person();
		p1.name="李欣";
		
		country=country;
	}

	//实例方法，也叫做非静态方法
	public void info()
	{
		System.out.println("姓名叫做:"+this.name+"，年龄是:"+age+",所在城市名称为:"+country);
	}
	
	public static void main(String[] args)
	{
		//我们对静态变量的访问，可以不通过创建对象来访问
		//类名。静态变量   是存放在全局静态数据区
		//Person.country="南京";
		country="南京";
		
		Person p1 = new Person("小红",30);
		p1.info();
		
		
		Person p2 = new Person("小王",18);
		p2.info();
		
        p2.country="金陵";
    	p1.info();
	}

}
