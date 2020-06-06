package com.jdk8.juf;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class StreamDemo {
    public static void main(String[] args) {


        User user1= new User(11,"a",23);
        User user2= new User(12,"b",24);
        User user3= new User(13,"c",22);
        User user4= new User(14,"c",26);
        User user5= new User(15,"e",27);
        User user6= new User(16,"f",28);
        List<User> list  =   Arrays.asList(user1,user2,user3,user4,user5,user6);


        //id 是偶数的，并且年龄大于24，用户名转为大写，用户名字母倒排序
        //并且只能输出一个用户名
        list.stream().filter(e->e.getId()%2==0)
        .filter(e->e.getAge()>24 )
                .map(e-> e.getUserName().toLowerCase())
                .sorted((e,e1) ->(((String) e1).compareTo(e)))
                .limit(1)
                .forEach(
                        System.out::println
                );



     /*   Function<String,Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        Integer length = function.apply("zhangsna");
        System.out.println(length);*/


        Function<String,Integer> func =  e -> {return e.length();};
        System.out.println(func.apply("wwwww"));


  /*      Predicate<String> pre = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.isEmpty();
            }
        };
        System.out.println(pre.test("qqqqq"));*/


        Predicate<String> pre1 = e ->{return e.isEmpty();};
        System.out.println(pre1.test(("1212121")));


        /*
        Consumer<String > consumer  = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("111111");
            }
        };
       consumer.accept("ddd");
         */


        Consumer<String > consumer1 = e -> {System.out.println("5555");};
        consumer1.accept("4444");

        /*
        Supplier<String > supplier = new Supplier<String>() {
            @Override
            public String get() {
                return null;
            }
        };*/

        Supplier<String > supplier1 = ()->{
            return "21212121";
        };
        System.out.println(supplier1.get());





    }
}
