/**
 * 
 */
package com.leilei.learn.mybatis.inter;

import com.leilei.learn.mybatis.pojo.Student;

/**
 * <p>
 * Title: StudentInter
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author: 磊磊
 * @date: 2018年1月8日 下午5:46:03
 * @version: V1.0
 */
public interface StudentInter {

	public Student getStudentInfo(String id);

	public Student getStudentAndDetailInfo(String id);

	public Student getStudent(String id);

}
