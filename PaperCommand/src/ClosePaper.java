
public class ClosePaper implements PaperCommand {
	
	public ClosePaper(MyDevice myDevise) {
		 
		this.myDevise = myDevise;
	}

	public MyDevice myDevise ;

	public MyDevice getMyDevise() {
		return myDevise;
	}

	public void setMyDevise(MyDevice myDevise) {
		this.myDevise = myDevise;
	}

	@Override
	public void execute() {
		 
		myDevise.close();

	}

}
