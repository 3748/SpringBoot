package com.gp6.springboot26.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/*
    使用JPA注解配置映射关系
        @Entity : 告诉JPA这是一个实体类（和数据表映射的类）
        @Table  : 来指定和哪个数据表对应;如果省略默认表名就是user
        @Id     : 标明主键
 */
@Entity
@Table(name = "m_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    // 和数据表对应的一个列
    @Column(name = "user_name",length = 50)
    private String userName;

    // 省略,默认列名就是属性名
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
