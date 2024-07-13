package io.namoosori.java.travelClub;

import io.namoosori.java.travelClub.entity.TravelClub;

public class StoryAssistant {
	public static void main(String[] args) {
		TravelClub newClub = new TravelClub("kkamjjing Club", "kkamjjing TravelClub💕");
		System.out.println(newClub);

		System.out.println(TravelClub.getSample());
	}
}
