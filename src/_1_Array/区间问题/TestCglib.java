package _1_Array.区间问题;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;



public class TestCglib {
    public static void main(String[] args) {

        // 定义一个回调接口的数组
        Callback[] callbacks = new Callback[] {
                new MyApiInterceptor(), new MyApiInterceptorForPlay()
        };

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Person.class); // 设置要代（dai）理的父类
        enhancer.setCallbacks(callbacks); // 设置回调的拦(lan)截器数组
        enhancer.setCallbackFilter(new CallbackFilterImpl()); // 设置回调选择器

        Person person = (Person) enhancer.create(); // 创建代（dai）理对象

        person.eat();
        System.out.println("--------------------");
        person.play();
    }
}

class MyApiInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("吃饭前我会先洗手"); // 此处可以做一些操作
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("吃完饭我会先休息会儿" );  // 方法调用之后也可以进行一些操作
        return result;
    }
}
class MyApiInterceptorForPlay implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("出去玩我会先带好玩具"); // 此处可以做一些操作
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("玩一个小时我就回家了" );  // 方法调用之后也可以进行一些操作
        return result;
    }
}

class CallbackFilterImpl implements CallbackFilter {
    @Override
    public int accept(Method method) {
        if (method.getName().equals("play"))
            return 1;
        else
            return 0;
    }
}


// 创建一个普通类做为代（dai）理类
class Person {
    //  代（dai）理类中由普通方法
    public void eat() {
        System.out.println("我要开始吃饭咯...");
    }

    public void play() {
        System.out.println("我要出去玩耍了,,,");
    }
}
