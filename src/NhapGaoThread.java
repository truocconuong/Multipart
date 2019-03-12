public class NhapGaoThread extends Thread {
    public Store store = new Store();

    public NhapGaoThread(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        store.NhapGao(50);
    }
}
