package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> selectAllEmployee();
    List<Employee> selectAll(@Param("page") Integer page,@Param("pageSize") Integer pageSize);

    void addEmployee(@Param("employee") Employee employee);

    Employee selectOneEmployee(@Param("employeeID") String employeeID);

    void updateEmployee(@Param("employeeID") String employeeID,@Param("employee") Employee employee);

    void deleteEmployee(@Param("employeeID") String employeeID);

    List<Employee> selectEmployeeByKeyWord(@Param("keyWord") String keyWord);
}
