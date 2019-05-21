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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import data.Person;

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
	private Label vornameOUT;
	private Label nachnameOUT;
	private Label strasseOUT;
	private Label hausnummerOUT;
	private Label wohnortOUT;
	private Label plzOUT;

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
		shlWindow.setSize(500, 310);
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
				//
				getVornameOUT().setText(vornameTF.getText());
				getNachnameOUT().setText(nachnameTF.getText());
				getStrasseOUT().setText(strasseTF.getText());
				getHausnummerOUT().setText(hausnummerTF.getText());
				getWohnortOUT().setText(wohnortTF.getText());
				getPlzOUT().setText(plzTF.getText());
				//
				Person p1; //Variablen Def.
				p1 = new Person(); //Instanzierung
				//
				p1.setVorname(getVornameTF().getText());
				p1.setNachname(getNachnameTF().getText());
				p1.setStrasse(getStrasseTF().getText());
				p1.setHausnummer(getHausnummerTF().getText());
				p1.setPlz(getPlzTF().getText());
				p1.setWohnort(getWohnortTF().getText());
				//
				System.out.println(p1);
				//
				Person.getListe().add(p1);
				//
				System.out.print(Person.getListe());
				//
				getVornameTF().setText("");
				getNachnameTF().setText("");
				getStrasseTF().setText("");
				getHausnummerTF().setText("");
				getPlzTF().setText("");
				getWohnortTF().setText("");
				
				
			}
		});
		btnMybutton.setBounds(157, 232, 75, 25);
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
		btnAbbrechen.setBounds(238, 232, 75, 25);
		btnAbbrechen.setText("Abbrechen");
		
		vornameOUT = new Label(shlWindow, SWT.NONE);
		vornameOUT.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		vornameOUT.setBounds(296, 28, 120, 15);
		
		nachnameOUT = new Label(shlWindow, SWT.NONE);
		nachnameOUT.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		nachnameOUT.setBounds(296, 64, 120, 15);
		
		strasseOUT = new Label(shlWindow, SWT.NONE);
		strasseOUT.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		strasseOUT.setBounds(296, 99, 120, 15);
		
		hausnummerOUT = new Label(shlWindow, SWT.NONE);
		hausnummerOUT.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		hausnummerOUT.setBounds(296, 133, 120, 15);
		
		wohnortOUT = new Label(shlWindow, SWT.NONE);
		wohnortOUT.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		wohnortOUT.setBounds(296, 163, 120, 15);
		
		plzOUT = new Label(shlWindow, SWT.NONE);
		plzOUT.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		plzOUT.setBounds(296, 192, 120, 15);
		
		Button btnJson = new Button(shlWindow, SWT.NONE);
		btnJson.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				Gson gson = new GsonBuilder().setPrettyPrinting().create();
				//
				System.out.println(gson.toJson(Person.getListe()));
			}
		});
		btnJson.setBounds(322, 232, 75, 25);
		btnJson.setText("json");
		shlWindow.setTabList(new Control[]{vornameTF, nachnameTF, strasseTF, hausnummerTF, wohnortTF, plzTF, btnMybutton});

	}
	public Text getNachnameTF() {
		return nachnameTF;
	}
	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getStrasseTF() {
		return strasseTF;
	}
	public Text getHausnummerTF() {
		return hausnummerTF;
	}
	public Text getWohnortTF() {
		return wohnortTF;
	}
	public Text getPlzTF() {
		return plzTF;
	}
	public Label getVornameOUT() {
		return vornameOUT;
	}
	public Label getNachnameOUT() {
		return nachnameOUT;
	}
	public Label getStrasseOUT() {
		return strasseOUT;
	}
	public Label getHausnummerOUT() {
		return hausnummerOUT;
	}
	public Label getWohnortOUT() {
		return wohnortOUT;
	}
	public Label getPlzOUT() {
		return plzOUT;
	}
}
