package com.progect.musicPlayer;

import com.progect.musicPlayer.music.Music;
import com.progect.musicPlayer.music.JazzMusic;
import com.progect.musicPlayer.music.ClassicMusic;

public class StartPlayer {

	public static void main( String[] args) {
		
		Music music = new ClassicMusic();
		
		MusicPlayer musicPlayer = new MusicPlayer(music);
		
		musicPlayer.playMusic();
	}
	
}
