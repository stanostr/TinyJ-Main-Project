//Stanislav Ostrovskii
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class LEinstr extends ZeroOperandInstruction {

  void execute ()
  {
    /* added */
	if(EXPRSTACK[ESP-2] <= EXPRSTACK[ESP-1]) 
		EXPRSTACK[ESP-2] = 1;
	else EXPRSTACK[ESP-2] = 0;
	ESP--;
  }

  public LEinstr ()
  {
    super("LE");
  }
}

