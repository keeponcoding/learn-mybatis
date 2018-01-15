/**
 * 
 */
package com.leilei.learn.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.leilei.learn.mybatis.inter.DepartmentMapper;
import com.leilei.learn.mybatis.inter.EmployeeMapper;
import com.leilei.learn.mybatis.inter.StudentInter;
import com.leilei.learn.mybatis.pojo.Department;
import com.leilei.learn.mybatis.pojo.Employee;
import com.leilei.learn.mybatis.pojo.Student;

/**
 * <p>
 * Title: Test
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author: 磊磊
 * @date: 2018年1月8日 下午3:28:29
 * @version: V1.0
 */
public class Test {

	public SqlSessionFactory getSqlSessionFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		return sqlSessionFactory;
	}

	@org.junit.Test
	public void test1() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			Student student = openSession.selectOne("test.selectOne", "1");
			System.out.println(student);
		} finally {
			openSession.close();
		}
	}

	@org.junit.Test
	public void test2() throws IOException {
		// 创建SqlSession工厂类
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

		// 获取SqlSession
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			// 获取接口的代理对象
			StudentInter studentInter = openSession.getMapper(StudentInter.class);
			System.out.println(studentInter);
			Student student = studentInter.getStudentInfo("2");
			System.out.println("****************" + student.getName());
			System.out.println("****************" + student.getGener());
		} finally {
			openSession.close();
		}
	}

	@org.junit.Test
	public void test3() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			StudentInter studentInter = sqlSession.getMapper(StudentInter.class);
			Student student = studentInter.getStudentAndDetailInfo("1");
			System.out.println("================》" + student.getAge());
			System.out.println("================》" + student.getName());
			System.out.println("================》" + student.getGener());
			System.out.println(student.getDetailInfo());
		} finally {
			sqlSession.close();
		}
	}

	@org.junit.Test
	public void test4() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession = sqlSessionFactory.openSession();
		try {
			StudentInter mapper = openSession.getMapper(StudentInter.class);
			Student student = mapper.getStudent("1");
			System.out.println("================》" + student.getAge());
			System.out.println("================》" + student.getName());
			System.out.println("================》" + student.getGener());
		} finally {
			openSession.close();
		}
	}

	@org.junit.Test
	public void test5() throws IOException {
		SqlSessionFactory sessionFactory = getSqlSessionFactory();
		SqlSession openSession = sessionFactory.openSession();
		try {
			EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
			Employee employee = employeeMapper.getEmpAndDept("1");
			System.out.println(employee.getGender());
			System.out.println(employee.getDept());
		} finally {
			openSession.close();
		}

	}

	@org.junit.Test
	public void test6() throws IOException {
		SqlSessionFactory sessionFactory = getSqlSessionFactory();
		SqlSession openSession = sessionFactory.openSession();
		try {
			EmployeeMapper employeeMapper = openSession.getMapper(EmployeeMapper.class);
			Employee employee = employeeMapper.getEmpAndDept2("1");
			System.out.println(employee.getName());
			System.out.println(employee.getDept());
		} finally {
			openSession.close();
		}
	}

	@org.junit.Test
	public void test7() throws IOException {
		SqlSessionFactory sessionFactory = getSqlSessionFactory();
		SqlSession openSession = sessionFactory.openSession();
		try {
			DepartmentMapper departmentMapper = openSession.getMapper(DepartmentMapper.class);
			Department deptAndEmp = departmentMapper.getDeptAndEmp("1");
			System.out.println(deptAndEmp.getDeptName());
			System.out.println(deptAndEmp.getEmps());
		} finally {
			openSession.close();
		}
	}

	@org.junit.Test
	public void test8() throws IOException {
		SqlSessionFactory sessionFactory = getSqlSessionFactory();
		SqlSession openSession = sessionFactory.openSession();
		try {
			DepartmentMapper departmentMapper = openSession.getMapper(DepartmentMapper.class);
			// Department deptAndEmp = departmentMapper.getDeptAndEmp2("3");
			// System.out.println(deptAndEmp.getDeptName());
			// System.out.println(deptAndEmp.getEmps());
			List<Department> depts = departmentMapper.getDeptsByIds(Arrays.asList("1", "2", "3"));
			for (Department department : depts) {
				System.out.println(department);
			}
		} finally {
			openSession.close();
		}
	}

	@org.junit.Test
	public void testSecCache() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession openSession1 = sqlSessionFactory.openSession();
		SqlSession openSession2 = sqlSessionFactory.openSession();
		try {
			EmployeeMapper mapper1 = openSession1.getMapper(EmployeeMapper.class);
			Employee e1 = mapper1.getEmpById("1");
			System.out.println("************" + e1);
			openSession1.close();

			EmployeeMapper mapper2 = openSession2.getMapper(EmployeeMapper.class);
			Employee e2 = mapper2.getEmpById("1");
			System.out.println("=============" + e2);
			openSession2.close();
		} finally {

		}
	}
}
