
public class CommandControl {
	
	public PaperCommand paperCommand;

	 
	public CommandControl(PaperCommand bookCommand) {
		 
		this.paperCommand = bookCommand;
	}
	
	public void buttonClick() {
		paperCommand.execute();
	}

	public PaperCommand getPaperCommand() {
		return paperCommand;
	}

	public void setPaperCommand(PaperCommand paperCommand) {
		this.paperCommand = paperCommand;
	}

	
	
	
}
