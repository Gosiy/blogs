package cn.gaosiy.commons;

/**
 * 返回结果公共类
 * @author gaosiy
 * 2020-12-28 10:06:37
 */
public class ResponseResult<T> {

	private Integer status;
	private String msg;
	private T data;

	public ResponseResult() {
	}
	
	public ResponseResult(Integer status, String msg, T data) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
	}

	public ResponseResult(Integer status, String msg) {
		super();
		this.status = status;
		this.msg = msg;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
