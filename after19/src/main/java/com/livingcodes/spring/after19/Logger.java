package com.livingcodes.spring.after19;

public class Logger {
	private LogWritter consoleWritter;
	private LogWritter fileWritter;

	public LogWritter getConsoleWritter() {
		return consoleWritter;
	}

	public void setConsoleWritter(ConsoleWritter consoleWritter) {
		this.consoleWritter = consoleWritter;
	}

	public LogWritter getFileWritter() {
		return fileWritter;
	}

	public void setFileWritter(FileWritter fileWritter) {
		this.fileWritter = fileWritter;
	}

	public void writeFile(String string) {
		fileWritter.write(string);

	}

	public void writeConsole(String string) {
		consoleWritter.write(string);

	}

}
