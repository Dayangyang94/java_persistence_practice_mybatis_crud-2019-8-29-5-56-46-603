package tws.repository;

import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import tws.entity.Employee;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@MybatisTest
public class EmployeeMapperTest {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    JdbcTemplate jdbcTemplate;

    void tearDown() {

    }
    public void insertTest(){
        //given
        jdbcTemplate.execute("insert into employee('id','name','age') values ('1','zhangsan','23')");
        //when
        List<Employee> employees=employeeMapper.selectAllEmployee();
        //then
        assertEquals(1,employees.size());


    }


}