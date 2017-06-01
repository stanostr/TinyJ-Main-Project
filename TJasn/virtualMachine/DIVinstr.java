//Stanislav Ostrovskii
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class DIVinstr extends ZeroOperandInstruction {

  void execute ()
  {
    /* added */
	EXPRSTACK[ESP-2] = EXPRSTACK[ESP-2] / EXPRSTACK[ESP-1];
	ESP--;
  }

  public DIVinstr ()
  {
    super("DIV");
  }
}
