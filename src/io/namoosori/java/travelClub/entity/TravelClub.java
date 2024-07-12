package io.namoosori.java.travelClub.entity;

import java.util.UUID;
import io.namoosori.java.travelClub.util.DateUtil;

public class TravelClub {
	private static final int MINIMUM_NAME_LENGTH = 3; // 사용자 정의 상수
	private static final int MINIMUM_INTRO_LENGTH = 10;
	private String id; // 고유 값. 자동 생성
	private String clubName; // 클럽 이름
	private String intro; // 클럽 소개
	private String foundationDay; // 클럽 개설 시간



	private TravelClub() {
		this.id = UUID.randomUUID().toString();
	}


	public TravelClub(String clubName, String intro) { // 생성자 만들기
		this();
		setClubName(clubName);
		this.intro = intro;
		this.foundationDay = DateUtil.today();
	}

	// Method
	// setter
	public void setClubName(String clubName) {
		if (clubName.length() < MINIMUM_NAME_LENGTH) {
			System.out.println("클럽 이름은 3글자 이상이어야 합니다.");
			return;
		}// 3글자 미만일 경우 메시지가 뜨고 바로 종료 된다. 아래 this.clubName = clubName 은 수행되지 않는다.
		this.clubName = clubName;
	}

	// getter
	public String getClubName() {
		return this.clubName;
	}
}
