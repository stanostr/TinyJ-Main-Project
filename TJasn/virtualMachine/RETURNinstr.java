//Stanislav Ostrovskii
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;
import TJasn.TJ;

public class RETURNinstr extends OneOperandInstruction {

  void execute ()
  {
    /* added */
	ASP = FP+1; //deallocates local variables
	FP = TJ.data[--ASP - POINTERTAG]; //restores FP of caller, and deallocates pointer
	PC = TJ.data[--ASP - POINTERTAG]; //puts the saved return address into PC
	ASP -= operand;
	
  }

  public RETURNinstr (int operand)
  {
    super(operand, "RETURN");
  }
}

