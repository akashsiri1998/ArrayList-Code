package String;

public class AcountDetail implements Runnable {
        Acount a=new Acount();
	    public void run() {
	    	for(int i=0;i<=3;i++) {
	    		withdraw(500);
	    		if(a.getBalance()<0) {
	    			System.out.println("stop");
	    		}
	    		
	    	}
	    }
	    
	    public synchronized void withdraw(int amt) {
	    	if(a.getBalance()>=amt) {
	    		System.out.println(Thread.currentThread().getName()+"Ready To going Thread: "+amt);
	    	}
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	int bal=a.getWithdrawal(amt);
	    	System.out.println("Wiyhdraw complete:= "+bal);
	    }
	
	public static void main(String[] args) {
		AcountDetail a=new AcountDetail();
		Thread t1=new Thread(a);
		Thread t2=new Thread(a);
		t1.setName("radhika");
		t2.setName("Saroj");
		
		t1.start();
		t2.start();

	}

}
