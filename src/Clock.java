import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Clock extends JFrame {
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	String time;
	String day;
	String date;
	
	Clock() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350, 200);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setTitle("Clock");
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font(null, Font.PLAIN, 50));
		timeLabel.setForeground(Color.GREEN);
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font(null, Font.PLAIN, 35));
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font(null, Font.PLAIN, 35));
		
		timeFormat = new SimpleDateFormat("hh:mm.ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("dd MMMM yyyy G");
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true);
		
		setTime();
	}
	
	public void setTime() {
		while (true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
