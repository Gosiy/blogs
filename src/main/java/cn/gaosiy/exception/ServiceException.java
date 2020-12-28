package cn.gaosiy.exception;

/**
 * 异常基类
 * @author gaosiy
 * 2020-12-28 10:09:53
 */
public class ServiceException extends RuntimeException{

	private static final long serialVersionUID = 360138832966761580L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}
	

}
