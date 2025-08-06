package  com.pk.dao;

import java.util.List;

import com.pk.model.Employee;

public interface IEmployeeDAO {
    public  List<Employee>  showAllEmployeesByDesgs(String desg1,String desg2,String desg3)throws Exception;
    
}
