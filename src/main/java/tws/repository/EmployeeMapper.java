package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import tws.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    List<Employee> selectAll();
    Employee selectOne(@Param("employeeId") String employee);
    void updateOne(@Param("employeeId") String id,@Param("employee")Employee employee);
    void insert(@Param("employee") Employee employee);
    void deleteOne(@Param("employeeId") String employeeId);
}
