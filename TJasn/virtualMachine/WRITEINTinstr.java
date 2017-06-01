package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class WRITEINTinstr extends ZeroOperandInstruction {

  void execute ()
  {
    /* added */
	System.out.print(EXPRSTACK[ESP-1]);
	ESP--;
  }

  public WRITEINTinstr ()
  {
    super("WRITEINT");
  }
}

