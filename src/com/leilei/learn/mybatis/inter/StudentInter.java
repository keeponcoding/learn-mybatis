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
 * @author: ����
 * @date: 2018��1��8�� ����5:46:03
 * @version: V1.0
 */
public interface StudentInter {

	public Student getStudentInfo(String id);

	public Student getStudentAndDetailInfo(String id);

	public Student getStudent(String id);

}
