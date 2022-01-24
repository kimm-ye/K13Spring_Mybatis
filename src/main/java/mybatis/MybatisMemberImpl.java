package mybatis;

import org.springframework.stereotype.Service;

@Service
public interface MybatisMemberImpl {
	
	//memberVO에 저장한다.
	/*
	로그인처리를 위한 추상메서드
		: 아이디, 패스워드와 일치하는 회원정보가 있는 경우
		MemberVO객체를 통해 반환받는다.
	 */
	public MemberVO login(String id, String pass);
}
