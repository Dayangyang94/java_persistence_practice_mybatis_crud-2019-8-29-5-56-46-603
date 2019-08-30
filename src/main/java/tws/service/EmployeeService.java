package tws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tws.dto.EmployeeDTO;
import tws.entity.Employee;
import tws.repository.EmployeeMapper;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public EmployeeDTO getEmployeeWithDesc(String employeeID){
        Employee employee = employeeMapper.selectOneEmployee(employeeID);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setAge(employee.getAge());
        employeeDTO.setDesc(employee.getEmplyeeWithDesc());
        employeeDTO.setId(employee.getId());
        employeeDTO.setName(employee.getName());
        return employeeDTO;
    }

    public List<Employee> getAllEmployee(Integer page,Integer pageSize,String keyWord){
        if (keyWord!=null) return employeeMapper.selectEmployeeByKeyWord(keyWord);
            else
         return employeeMapper.selectAll(page,pageSize);
    }
}
