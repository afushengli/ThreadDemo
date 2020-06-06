package com.jdk8.juf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {
    private Integer Id;
    private String userName;
    private int age;


    public static void main(String[] args) {
        User user  =new User();
        user.setId(1).setUserName("张三").setAge(4);
        System.out.println(user);
    }

}
