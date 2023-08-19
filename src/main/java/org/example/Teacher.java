package org.example;

import lombok.Data;


/**
 * projectName:org.example
 *
 * @author: 胡刚
 * time:2023/8/9 14:42
 * description:
 */

@Data
public class Teacher {
    private String name;
    private Integer age;
    private String salary;
    
    public void work() {
        System.out.println("我在工作");
        System.out.println(salary);
    }
}
