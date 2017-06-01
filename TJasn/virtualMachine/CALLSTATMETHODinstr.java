//Stanislav Ostrovskii
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;

public class CALLSTATMETHODinstr extends OneOperandInstruction {

  void execute ()
  {
    /* Added */
	TJ.data[ASP++ - POINTERTAG] = PC;
	PC = operand;
  }

  public CALLSTATMETHODinstr (int startAddr)
  {
    super(startAddr, "CALLSTATMETHOD");
  }
}
