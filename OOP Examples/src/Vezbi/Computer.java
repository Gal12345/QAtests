package Vezbi;

import java.util.Arrays;

public class Computer {

	private String type;
	private int procSpeed;
	private String files[];

	public Computer(String type, int procSpeed, String[] files) {
		super();
		this.type = type;
		this.procSpeed = procSpeed;
		this.files = files;
	}

	public Computer(String type, int procSpeed) {
		super();
		this.type = type;
		this.procSpeed = procSpeed;
	}

	public Computer() {
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getProcSpeed() {
		return procSpeed;
	}

	public void setProcSpeed(int procSpeed) {
		this.procSpeed = procSpeed;
	}

	public String[] getFiles() {
		return files;
	}

	public void setFiles(String[] files) {
		this.files = files;
	}

	public String toString()
	{
		return "This is type: " + type + "\nThis is procSpeed: " + procSpeed + "\nThese are files: " + Arrays.toString(files);
	}

}
