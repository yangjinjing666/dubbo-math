package com.yangjinjing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yangjinjing.math.service.CalulateService;


/** 
* @author 作者:杨今敬
* @version 创建时间：2020年2月23日 下午9:09:14
* 类功能说明 
*/
public class ConsumerStart {
	private static ClassPathXmlApplicationContext contxt;
	
	public static void main(String[] args) {
		contxt = new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");
		
		CalulateService calulateService = contxt.getBean(CalulateService.class);
		int a = 60;
		int b = 2;
		int jiafa = calulateService.jiafa(a, b);
		System.out.println("----" + a +"+"+ b +"="+ jiafa);
		
		int jianfa = calulateService.jianfa(a, b);
		System.out.println("----" + a +"-"+ b +"="+ jianfa);
		
		int chegnfa = calulateService.chegnfa(a, b);
		System.out.println("----" + a +"*"+ b +"="+ chegnfa);
		
		int chufa = calulateService.chufa(a, b);
		System.out.println("----" + a +"/"+ b +"="+ chufa);
		
		
	}
}
