//Stanislav Ostrovskii
package TJasn.virtualMachine;

import static TJasn.virtualMachine.CodeInterpreter.*;

public class JUMPinstr extends OneOperandInstruction {

  void execute ()
  {
    /* added */
	PC = operand;
  }

  public JUMPinstr (int address)
  {
    super(address, "JUMP");
  }
}

