package cn.gaosiy.commons;

import org.springframework.web.bind.annotation.ExceptionHandler;

import cn.gaosiy.exception.ServiceException;

/**
 * 统一父类
 * @author gaosiy
 * 2020-12-2810:00:52
 */
public abstract class BaseController {
	
	protected final static Integer SUCCESS = 2000;
	protected final static Integer FAILED = 4004;
	
	
	@ExceptionHandler
	public ResponseResult<Void> exceptionHanler(Throwable e){
		ResponseResult<Void> result = new ResponseResult<Void>();
		if(e instanceof ServiceException) {
			result.setMsg(e.getMessage());
		} else {
			result.setMsg("出现未知错误");
		}
		result.setStatus(FAILED);
		return result;
	}

}
