/**
 * 
 */
package com.leilei.learn.mybatis.pojo;

/**
 * <p>
 * Title: DetailInfo
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author: ����
 * @date: 2018��1��10�� ����8:48:15
 * @version: V1.0
 */
public class DetailInfo {

	private Integer id;
	private String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "DetailInfo [id=" + id + ", address=" + address + "]";
	}

}
