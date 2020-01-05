package com.gzy.spring_jadc_template_test;

import com.gzy.spring_jadc_template_test.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class App {
    private static ApplicationContext context;

    public static void main(String[] args){
        context = new ClassPathXmlApplicationContext("SpringJdbcTemplateBeans.xml");
        System.out.println("读取到配置文件了");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
        System.out.println("创建好数据库连接了");

//        // 更新：插入数据
//        String sqlinsert = "INSERT INTO student VALUES(?,?,?)";
//        int countinsert = jdbcTemplate.update(sqlinsert, new Object[] {2, "gaozhiyong", 25});
//        System.out.println(countinsert);
//
//        //更新：删除数据
//        String sqldelete = "DELETE FROM student WHERE id =?";
//        int countdelete = jdbcTemplate.update(sqldelete,2);
//        System.out.println(countdelete);
//
//        //更新： 修改数据
//        String sqlmodify = "UPDATE student SET name=?,age=? WHERE id=?";
//        int countmodify = jdbcTemplate.update(sqlmodify,new Object[]{"gzy",24,1});
//        System.out.println(countmodify);

        //查询：查询数据
        String sqlselect = "SELECT * FROM student";
        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
//        // queryForObject 用于查询单条数据
//        Student student = jdbcTemplate.queryForObject(sqlselect,rowMapper);
//        System.out.println(student);

        //query 用于查询多条语句
        List<Student> students = jdbcTemplate.query(sqlselect,rowMapper);
        for (Student student :students){
            System.out.println(student);
        }
    }
}
