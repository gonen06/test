class RussellGroup{  
	void conductResearch(){System.out.println("produce world-leading research");}  
}  
  
class QMUL extends RussellGroup{  
	@Override  
	void conductresearch(){
		System.out.println("produce world-leading research");//should be conductResearch  
	}
}  
  
class TestOverride{  
	public static void main(String args[]){  
		RussellGroup rg =new QMUL();  
		rg.conductResearch();  
	}
}  