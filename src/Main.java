public class Main {
    public static void main(String[] args) {
        Store taphoa = new Store();
        XuatGaoThread xuatGao = new XuatGaoThread(taphoa);
        NhapGaoThread nhapGao = new NhapGaoThread(taphoa);
        xuatGao.start();
        nhapGao.start();

    }
}
