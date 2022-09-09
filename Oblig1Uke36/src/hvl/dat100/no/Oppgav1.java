package hvl.dat100.no;

import static javax.swing.JOptionPane.*; 
import static java.lang.Integer.*;

public class Oppgav1 {

	public static void main(String[] args) {
		
		String inntekTxt = showInputDialog("Hva er lønnen din ?");
		int lonn = parseInt(inntekTxt);
		
		double skatt;
		double brutto;
		
		if (lonn<=164100) {
			skatt=lonn*0;
			brutto = lonn-skatt;
			showMessageDialog(null,brutto);
		}
		if (lonn>=164100 && lonn<=230950) {
			skatt = lonn*0.0093;
			brutto = lonn-skatt;
			showMessageDialog(null,brutto);
		}
		if (lonn>=230951 && lonn<=580650) {
			skatt = lonn*0.00241;
			brutto = lonn-skatt;
			showMessageDialog(null,brutto);
		}
		if (lonn>=580651 && lonn<=934050) {
			skatt = lonn*0.1152;
			brutto = lonn-skatt;
			showMessageDialog(null,brutto);
		}
		if (lonn>=934051) {
			skatt=lonn*0.1452;
			brutto=lonn-skatt;
			showMessageDialog(null,brutto);
		}
		
	}

}
