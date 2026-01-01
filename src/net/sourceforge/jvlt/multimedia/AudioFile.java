package net.sourceforge.jvlt.multimedia;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;


/**
 * This class represents an audio file that can be played with jVLT. Other audio
 * files (e.g. mp3 and ogg files) are represented by CustomMultimediaFile.
 */
public class AudioFile extends MultimediaFile {
	public AudioFile(String file_name) {
		super(file_name, AUDIO_FILE);
	}

	public AudioFile() {
		this("");
	}

	public void play() throws IOException {
    File f = getFile();
    if (!f.exists() || !f.isFile()) {
        throw new IOException("File does not exist or cannot be opened: " + f.getAbsolutePath());
    }
    // Temporarily disabled audio playback for parsing test
    System.out.println("Audio playback disabled temporarily.");
    }
}
