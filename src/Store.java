public class Store {
    public int soLuongGao = 30;

    public synchronized void NhapGao(int kg){
        this.soLuongGao+=kg;
        System.out.println("Bạn vừa nhập "+kg+ " Vào kho");
        notify();
    }
    public synchronized  void XuatGao(int kg){
        if(this.soLuongGao<kg){
            System.out.println("Gạo không đủ để xuất");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.soLuongGao-=kg;
        System.out.println("Vừa xuất khỏi kho"+ kg + "Gạo - Và trong kho còn"+this.soLuongGao);
    }
}
