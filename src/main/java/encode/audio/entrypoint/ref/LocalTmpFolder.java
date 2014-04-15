package encode.audio.entrypoint.ref;

import java.util.HashSet;
import java.util.Set;

public class LocalTmpFolder {

	private final Set<String> audioFilesOnTmpDir;

	public LocalTmpFolder() {
		super();
		this.audioFilesOnTmpDir = new HashSet<String>();
	}

	public void addFile(String fileName)
	{
		audioFilesOnTmpDir.add(fileName);
	}

	public boolean isAudioFileExistsOnTmpFolder(String encodedFilename) {
		return audioFilesOnTmpDir.contains(encodedFilename);
	}
}