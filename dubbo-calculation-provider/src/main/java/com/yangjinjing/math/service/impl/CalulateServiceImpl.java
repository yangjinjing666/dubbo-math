package com.yangjinjing.math.service.impl;

import com.yangjinjing.math.service.CalulateService;

/** 
* @author 作者:杨今敬
* @version 创建时间：2020年2月23日 下午9:00:46
* 类功能说明 
*/
public class CalulateServiceImpl implements CalulateService{

	@Override
	public int jiafa(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int jianfa(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int chegnfa(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int chufa(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}

}
