package teamTask01;

public class UserVO {
	private int number;
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public UserVO(int number, String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "번호 : " + this.number + " 아이디 : " + this.id
				+ " 이름 : " + this.name + " 나이 : " + this.age;
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(this.number);
	}

	// equals 재정의 (userNo로 동일성 판단)
	@Override
	public boolean equals(Object obj) {
		System.out.println("함수 호출");
		if (this == obj) {  // 객체 본인이라면
			return true;  // true 반환
		}
		if (obj == null || getClass() != obj.getClass()) {  // 객체에 값이 없거나 같은 클래스가 아니라면
			return false;  // false 반환
		}
		UserVO userVO = (UserVO) obj;  // 다운캐스팅 강제형변환
		return number == userVO.number;  // 객체의 userNo가 같은지를 반환
	}

	public int getNumber() {
		return number;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
}
