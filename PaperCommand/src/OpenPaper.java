
public class OpenPaper implements PaperCommand {
	
	public OpenPaper(MyDevice myDevise) {
		 
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
		 
		myDevise.open();

	}

}
