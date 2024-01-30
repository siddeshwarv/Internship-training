package Magazines;

import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int i) {
        if (i >= 0 && i < magazines.size()) {
            Magazine magazineCopy = new Magazine(magazines.get(i));
            return magazineCopy;
        } else {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds for MagazineList");
        }
    }

    public void setMagazine(Magazine newMagazine, int i) {
        if (i >= 0 && i < magazines.size()) {
            Magazine mCopy = new Magazine(newMagazine);
            magazines.set(i, mCopy);
        } else {
            throw new IndexOutOfBoundsException("Index " + i + " out of bounds for MagazineList");
        }
    }

    public void addMagazine(Magazine newMagazine) {
        Magazine mCopy = new Magazine(newMagazine);
        magazines.add(mCopy);
    }
}
