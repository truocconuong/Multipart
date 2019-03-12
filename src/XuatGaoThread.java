public class XuatGaoThread extends Thread {
    public Store store = new Store();

    public XuatGaoThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.XuatGao(50);
    }
}
