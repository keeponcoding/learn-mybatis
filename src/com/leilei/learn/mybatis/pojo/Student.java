/**
 * 
 */
package com.leilei.learn.mybatis.pojo;

/**
 * <p>
 * Title: Student
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author: 磊磊
 * @date: 2018年1月8日 下午3:36:15
 * @version: V1.0
 */
public class Student {

	private String id;
	private String name;
	private Integer age;
	private Integer gener;
	private DetailInfo detailInfo;

	public DetailInfo getDetailInfo() {
		return detailInfo;
	}

	public void setDetailInfo(DetailInfo detailInfo) {
		this.detailInfo = detailInfo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getGener() {
		return gener;
	}

	public void setGener(Integer gener) {
		this.gener = gener;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gener=" + gener + ", detailInfo=" + detailInfo + "]";
	}

}
