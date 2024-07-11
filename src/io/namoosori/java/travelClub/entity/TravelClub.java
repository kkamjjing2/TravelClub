package io.namoosori.java.travelClub.entity;

import java.util.UUID;

public class TravelClub {
	private String id; // 고유 값. 자동 생성
	private String clubName; // 클럽 이름
	private String intro; // 클럽 소개
	private String foundationDay; // 클럽 개설 시간


	private TravelClub() {
		this.id = UUID.randomUUID().toString();
	}
	public TravelClub(String clubName, String intro) { // 생성자 만들기
		this();
		this.clubName = clubName;
		this.intro = intro;
	}
}
