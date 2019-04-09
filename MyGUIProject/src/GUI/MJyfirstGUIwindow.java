package GUI;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class MJyfirstGUIwindow {

	protected Shell shlWindow;
	private Label nachnameL;
	private Label wohnortL;
	private Label hausnummerL;
	private Label plzL;
	private Label StrasseL;
	private Text nachnameTF;
	private Text vornameTF;
	private Text strasseTF;
	private Text hausnummerTF;
	private Text wohnortTF;
	private Text plzTF;
	private Button btnAbbrechen;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MJyfirstGUIwindow window = new MJyfirstGUIwindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlWindow.open();
		shlWindow.layout();
		while (!shlWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlWindow = new Shell();
		shlWindow.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		shlWindow.setSize(450, 300);
		shlWindow.setText("FR Window");
		
		Button btnMybutton = new Button(shlWindow, SWT.NONE);
		btnMybutton.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_SELECTION_TEXT));
		btnMybutton.setForeground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_FOREGROUND));
		btnMybutton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.print("Hallo ");
				System.out.println(vornameTF.getText() + "!");
				System.out.print("Hier wohnst du: ");
				System.out.print(strasseTF.getText() + " ");
				System.out.print(hausnummerTF.getText() + ", ");
				System.out.print(plzTF.getText() + " ");
				System.out.print(wohnortTF.getText());
			}
		});
		btnMybutton.setBounds(309, 184, 75, 25);
		btnMybutton.setText("Abschicken");
		
		Label VornameL = new Label(shlWindow, SWT.NONE);
		VornameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		VornameL.setBounds(57, 28, 55, 15);
		VornameL.setText("Vorname");
		
		nachnameL = new Label(shlWindow, SWT.NONE);
		nachnameL.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		nachnameL.setBounds(57, 64, 65, 15);
		nachnameL.setText("Nachname");
		
		wohnortL = new Label(shlWindow, SWT.NONE);
		wohnortL.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		wohnortL.setBounds(57, 163, 55, 15);
		wohnortL.setText("Wohnort");
		
		hausnummerL = new Label(shlWindow, SWT.NONE);
		hausnummerL.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		hausnummerL.setBounds(57, 133, 75, 15);
		hausnummerL.setText("Hausnummer");
		
		plzL = new Label(shlWindow, SWT.NONE);
		plzL.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		plzL.setBounds(57, 192, 55, 15);
		plzL.setText("PLZ");
		
		StrasseL = new Label(shlWindow, SWT.NONE);
		StrasseL.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		StrasseL.setBounds(57, 99, 55, 15);
		StrasseL.setText("Stra\u00DFe");
		
		nachnameTF = new Text(shlWindow, SWT.BORDER);
		nachnameTF.setBounds(157, 58, 120, 21);
		
		vornameTF = new Text(shlWindow, SWT.BORDER);
		vornameTF.setBounds(157, 22, 120, 21);
		
		strasseTF = new Text(shlWindow, SWT.BORDER);
		strasseTF.setBounds(157, 93, 120, 21);
		
		hausnummerTF = new Text(shlWindow, SWT.BORDER);
		hausnummerTF.setBounds(157, 127, 120, 21);
		
		wohnortTF = new Text(shlWindow, SWT.BORDER);
		wohnortTF.setBounds(157, 157, 120, 21);
		
		plzTF = new Text(shlWindow, SWT.BORDER);
		plzTF.setBounds(157, 186, 120, 21);
		
		btnAbbrechen = new Button(shlWindow, SWT.NONE);
		btnAbbrechen.setBackground(SWTResourceManager.getColor(SWT.COLOR_LIST_BACKGROUND));
		btnAbbrechen.addSelectionListener(new SelectionAdapter() {
		
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnAbbrechen.setBounds(309, 215, 75, 25);
		btnAbbrechen.setText("Abbrechen");
		
		Composite composite = new Composite(shlWindow, SWT.NONE);
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.print(me.x + " / " + me.y);
			}
		});
		composite.setBounds(309, 114, 75, 64);
		shlWindow.setTabList(new Control[]{vornameTF, nachnameTF, strasseTF, hausnummerTF, wohnortTF, plzTF, btnMybutton});

	}
}
