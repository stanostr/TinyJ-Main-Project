//Stanislav Ostrovskii
package TJasn.virtualMachine;

import TJasn.TJ;

public class WRITESTRINGinstr extends TwoOperandInstruction {

  void execute ()
  {
    /* added */
	int i = firstOperand;
	while(i <= secondOperand)
	{
		System.out.print((char)(TJ.data[i++]));
	}
  }

  public WRITESTRINGinstr (int startOffset, int endOffset)
  {
    super(startOffset, endOffset, "WRITESTRING");
  }
}

