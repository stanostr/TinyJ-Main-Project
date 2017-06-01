//Stanislav Ostrovskii
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.virtualMachine.VirtualMachineHaltException;
import TJasn.TJ;

public class MULinstr extends ZeroOperandInstruction {

  void execute () throws VirtualMachineHaltException
  {
    /* added */
	EXPRSTACK[ESP-2] = EXPRSTACK[ESP-2] * EXPRSTACK[ESP-1];
	ESP--;
  }

  public MULinstr ()
  {
    super("MUL");
  }
}

