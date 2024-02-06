class BMS extends Thread{
    public void run(){
        while(true){
            System.out.println("BMSCE");
            try{
                Thread.sleep(10000);
            }
            catch(InterruptedException e){
                System.out.println("BMS thread interrupted");
            }
        }
        
    }
}

class CSE extends Thread{
    public void run(){
        while(true){
            System.out.println("CSE");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("CSE thread interrupted");
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        BMS b = new BMS();
        b.start();
        CSE c = new CSE();
        c.start();
    }
}
