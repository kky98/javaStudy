package ch12_exception;
// 사용자 정의 예외 처리 
public class BizException extends Exception{
	private String errCode = "";
	
	public BizException(String errCode, String errMsg) {
		super(errMsg);
		this.errCode = errCode;
	}
	public BizException(String errMsg) {
		super(errMsg);
	}
	public BizException() {
		super();
	}
	public BizException(Exception e) {
		super(e);
	}
	public String getErrCode() {
		return errCode;
	}
	
}
