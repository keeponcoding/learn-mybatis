/**
 * 
 */
package com.leilei.learn.mybatis.inter;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.leilei.learn.mybatis.pojo.Department;

/**
 * <p>
 * Title: DepartmentMapper
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author: 磊磊
 * @date: 2018年1月11日 上午8:55:32
 * @version: V1.0
 */
public interface DepartmentMapper {

	public Department getDeptById(String id);

	public Department getDeptAndEmp(String id);

	public Department getDeptAndEmp2(String id);

	public List<Department> getDeptsByIds(@Param("ids") List<String> ids);

}
