public class Employee {

	private String code;
	private String addr;
	
	public void setcode(String code) {
		this.code = new String(code);
	}
	public String getcode() {
		return code;
	}
	public void setaddr(String addr) {
		this.addr = new String(addr);
	}
	public String getaddr() {
		return addr;
	}
	
	
	@Override
	public String toString(){
		return "\ncode = "+getcode()+" :: addr "+getaddr();
	}
}