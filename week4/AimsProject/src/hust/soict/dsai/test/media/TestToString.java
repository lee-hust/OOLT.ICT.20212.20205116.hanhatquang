package hust.soict.dsai.test.media;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

public class TestToString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Media> medias = new ArrayList<>();
        DigitalVideoDisc dvd = new DigitalVideoDisc("The lion king", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book("Conan", "comic", "hi hi hi hi", 18, "ha quang", "nhat");
        Track track1 = new Track(24, "Quang");
        Track track2 = new Track(34, "Ha");
        CompactDisc cd = new CompactDisc("Quang", "music", "quang", 2.5f, "thi", track1, track2);
        medias.add(book);
        medias.add(cd);
        medias.add(dvd);
        for (Media media: medias) {
            System.out.println(media.toString());
        }
    }

}
