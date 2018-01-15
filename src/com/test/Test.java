/**
 * 
 */
package com.test;

/**
 * <p>
 * Title: test
 * </p>
 * <p>
 * Description: TODO
 * </p>
 * 
 * @author: 磊磊
 * @date: 2018年1月11日 下午6:15:34
 * @version: V1.0
 */
public class Test {

	public void m1() {
		int b = 1;
		int a = b / 0;
		System.out.println(2);
	}

	public void method() {
		// try {
		int i = 0;
		new Test().m1();
		// } catch (Exception e) {
		// System.out.println("========");
		// }
	}

	public static void main(String[] args) {
		try {
			new Test().method();
		} catch (Exception e) {
			System.out.println("1");
		}
	}

}
