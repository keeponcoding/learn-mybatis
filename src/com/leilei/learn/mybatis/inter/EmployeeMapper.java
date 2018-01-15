/**
 * 
 */
package com.leilei.learn.mybatis.inter;

import java.util.List;

import com.leilei.learn.mybatis.pojo.Employee;

/**
 * <p>
 * Title: EmployeeMapper
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author: 磊磊
 * @date: 2018年1月11日 上午8:34:52
 * @version: V1.0
 */
public interface EmployeeMapper {

	public Employee getEmpAndDept(String id);

	public Employee getEmpAndDept2(String id);

	public List<Employee> getEmpByDid(String did);

	public Employee getEmpById(String id);
}
