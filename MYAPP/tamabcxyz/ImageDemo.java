package thuchanhjavaswing;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImageDemo extends JFrame{
//	public ImageDemo() {
//		setSize(400,200);// tao bang
//		setVisible(true);// cho phep bang hien thi
//		//setResizable(false);// khong cho thu kich thuoc
//		JLabel lb=new JLabel();
//		add(lb);
//		//setForeground(Color.blue)
//		lb.setSize(400,200);
//		System.out.println("x "+lb.getSize().width+" y "+lb.getSize().height);
//		try {
//			BufferedImage img = ImageIO.read(new File("anonymous.png"));
//			int x=lb.getSize().width;
//			int y=lb.getSize().height;
//			int xx= img.getWidth();
//			int xy=img.getHeight();
//			
//			int dx=0,dy=0;
//			if(x/y>xx/xy) {
//				dy=y;
//				dx=dy*xx/xy;
//			}else {
//				dx=x;
//				dy=dx*xy/xx;
//			}
//			ImageIcon icon=new ImageIcon(img.getScaledInstance(dx, dy, img.SCALE_SMOOTH));
//			lb.setIcon(icon);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	public static void main(String[] args) {
//		ImageDemo dm=new ImageDemo();
	
		public ImageDemo() {
			setSize(1000,1000);
			setVisible(true);
			//setResizable(false);
			JLabel lb=new JLabel();
			add(lb);
			System.out.println("x= "+lb.getSize().width+" y= "+lb.getSize().height);
			try {
				BufferedImage im= ImageIO.read(new File("anonymous.png"));
				int x=lb.getSize().width;
				int y=lb.getSize().height;
				int xx=im.getWidth();
				int yy=im.getHeight();
				int dx,dy=0;
				if(x/y>xx/yy) {
					dy=y;
					dx=dy*xx/yy;
				}else {
					dx=x;
					dy=dx*yy/xx;
				}
				ImageIcon icon=new ImageIcon(im.getScaledInstance(dx, dy, im.SCALE_SMOOTH));
				lb.setIcon(icon);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // de dong chuong trinh lai tranh tinh trang ngon ram laptop
		}
		public static void main(String args[]) {
			ImageDemo dm=new ImageDemo();																																																																																																																														
	}
}
