package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class NOTinstr extends ZeroOperandInstruction {

  void execute ()
  {
     /* added */
	if(EXPRSTACK[ESP-1] == 1)
		 EXPRSTACK[ESP-1] = 0;
	else EXPRSTACK[ESP-1] = 1;
		 
  }

  public NOTinstr ()
  {
    super("NOT");
  }
}
