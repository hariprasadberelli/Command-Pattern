
public class DemoBookCommand {

	public static void main(String[] args) {

		MyDevice gardianpaper = new TheGuardianNewsPaper();

		OpenPaper openCommand = new OpenPaper(gardianpaper);

		CommandControl remoteCall = new CommandControl(openCommand);

		remoteCall.buttonClick();

		ReadPaper readCommand = new ReadPaper(gardianpaper);

		CommandControl readcontrol = new CommandControl(readCommand);

		readcontrol.buttonClick();

		ClosePaper closeCommand = new ClosePaper(gardianpaper);

		CommandControl closecontrol = new CommandControl(closeCommand);

		closecontrol.buttonClick();

	}

}
