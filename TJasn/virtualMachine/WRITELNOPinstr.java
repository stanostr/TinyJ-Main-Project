package TJasn.virtualMachine;

public class WRITELNOPinstr extends ZeroOperandInstruction {

  void execute ()
  {
    /* added */
	System.out.println();
	
  }

  public WRITELNOPinstr ()
  {
    super("WRITELNOP");
  }
}
