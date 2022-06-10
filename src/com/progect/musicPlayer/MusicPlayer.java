package com.progect.musicPlayer;

import com.progect.musicPlayer.music.Music;

public class MusicPlayer {
	
	Music playerMusic;
	
	MusicPlayer(Music music){
				
		playerMusic = music;
		
		}

	public void playMusic() {
		
		System.out.println("Playing music:" + playerMusic.getMusicName());		
	}
	
}
