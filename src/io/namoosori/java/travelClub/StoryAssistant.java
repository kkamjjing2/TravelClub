package io.namoosori.java.travelClub;

import io.namoosori.java.travelClub.entity.TravelClub;
import io.namoosori.ui.menu.ClubMenu;

public class StoryAssistant {

	private void startStory() {
		ClubMenu clubMenu = new ClubMenu();
		clubMenu.show();
	}
	public static void main(String[] args) {
		StoryAssistant assistant = new StoryAssistant();
		assistant.startStory();
	}
}
