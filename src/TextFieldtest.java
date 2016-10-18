import java.awt.*;

public class TextFieldtest extends Frame {
	TextField tf1 = new TextField(30);
	public TextFieldtest(String title){
		super(title);
		setLayout(new FlowLayout());
		add(tf1);
	}
	public void test(){
		tf1.setEditable(true);
		if(tf1.isEditable()) System.out.println("Hien ra.");
		else
			System.out.println("cung Hien ra.");
	}
}
