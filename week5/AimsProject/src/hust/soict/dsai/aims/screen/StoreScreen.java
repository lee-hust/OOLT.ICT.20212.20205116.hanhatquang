package hust.soict.dsai.aims.screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import hust.soict.dsai.aims.media.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

public class StoreScreen extends JFrame{
    private Store store;

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
        north.add(createMenuBar());
        north.add(createHeader());
        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options-HaNhatQuang-20205116");

        JMenu smUpdateStore = new JMenu("Update Store");
        smUpdateStore.add(new JMenuItem("Add Book"));
        smUpdateStore.add(new JMenuItem("Add CD"));
        smUpdateStore.add(new JMenuItem("Add DVD"));

        menu.add(smUpdateStore);
        menu.add(new JMenuItem("View store"));
        menu.add(new JMenuItem("View cart"));

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    JPanel createHeader() {
        JPanel header = new JPanel();
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
        title.setForeground(Color.CYAN);

        JButton cart = new JButton("View cart");
        cart.setPreferredSize(new Dimension(100, 50));
        cart.setMaximumSize(new Dimension(100, 50));

        header.add(Box.createRigidArea(new Dimension(10, 10)));
        header.add(title);
        header.add(Box.createHorizontalGlue());
        header.add(Box.createRigidArea(new Dimension(10, 10)));

        return header;
    }

    JPanel createCenter() {
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(3, 3, 2, 2));

        ArrayList<Media> mediaInStore = store.getItemsInStore();

        for (int i=0; i < 9; i++) {
            MediaStore cell = new MediaStore(mediaInStore.get(i));
            center.add(cell);
        }

        return center;
    }

    public StoreScreen(Store store) {
        this.store = store;
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);

        setVisible(true);
        setTitle("Store");
        setSize(1024, 728);
    }

    public static void main(String[] args) {
        Store store = new Store();

        Media dvd1 = new DigitalVideoDisc(1, "DVD1's Title", "Roger Aliers", 76, 87, "Animation");
        store.addMedia(dvd1);
        Media dvd2 = new DigitalVideoDisc(2, "Book2's Title", "Roger Aliers", 61, 87, "Animation");
        store.addMedia(dvd2);
        Media dvd3 = new DigitalVideoDisc(3, "CD3's Title", "Roger Aliers", 59, 87, "Animation");
        store.addMedia(dvd3);
        Media dvd4 = new DigitalVideoDisc(4, "DVD1's Title", "Roger Aliers", 76, 87, "Animation");
        store.addMedia(dvd4);
        Media dvd5 = new DigitalVideoDisc(5, "Book2's Title", "Roger Aliers", 61, 87, "Animation");
        store.addMedia(dvd5);
        Media dvd6 = new DigitalVideoDisc(6, "CD3's Title", "Roger Aliers", 95, 87, "Animation");
        store.addMedia(dvd6);
        Media dvd7 = new DigitalVideoDisc(7, "Book7's Title", "Roger Aliers", 24, 87, "Animation");
        store.addMedia(dvd4);
        Media dvd8 = new DigitalVideoDisc(8, "Book8's Title", "Roger Aliers", 78, 87, "Animation");
        store.addMedia(dvd5);
        Media dvd9 = new DigitalVideoDisc(9, "CD9's Title", "Roger Aliers", 95, 87, "Animation");
        store.addMedia(dvd6);

        new StoreScreen(store);
    }
}
