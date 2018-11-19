package com.gp6.springboot07.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Component
public class PersonProperties {
    /*
        xml配置方式:
            <bean class="Person">
                <property name="lastName" value="value"></property>
            <bean/>

        value有三种:
            1: 字面量:
                value="gp6"

            2: ${key}从配置文件中获取值
                @Value("${person.lastName}")

            3: #{SpEL}
     */
    @Value("${person.lastName}")
    private String lastName;
    @Value("#{22 + 2}")
    private Integer age;
    @Value("#{1 == 1}")
    private Boolean boss;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "PersonProperties{" + "lastName='" + lastName + '\'' + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", maps=" + maps + ", lists=" + lists + ", dog=" + dog + '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
