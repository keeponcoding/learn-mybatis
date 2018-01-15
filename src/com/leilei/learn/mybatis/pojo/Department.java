/**
 * 
 */
package com.leilei.learn.mybatis.pojo;

import java.util.List;

/**
 * <p>
 * Title: Department
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author: 磊磊
 * @date: 2018年1月11日 上午8:27:25
 * @version: V1.0
 */
public class Department {

	private String id;
	private String deptName;
	private List<Employee> emps;

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + ", emps=" + emps + "]";
	}

}
