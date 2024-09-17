public interface Doodling <T> {
    public boolean getSize();
    public static void main(String[] args) {
        class Bag <T> implements Doodling <T> {
            public boolean getSize() {
                Bag<Object> myBag = null;
                System.out.println(myBag.getSize());
                return false;
            }
        }
        Bag <String> myBag = new Bag <String>();

    }
}
