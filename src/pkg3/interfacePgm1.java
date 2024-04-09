package pkg3;

interface tvRemote{
	
	public void volumeUp();
	public void volumeDown();
}

interface smartTvRemote extends tvRemote{
	
	public void youTube();
	public void netflix();
}

class tv implements smartTvRemote{

	@Override
	public void volumeUp() {
		
		System.out.println("volume up details");
		
	}

	@Override
	public void volumeDown() {
		
		System.out.println("Volume down details");
	}

	@Override
	public void youTube() {
		System.out.println("Youtube details");
		
	}

	@Override
	public void netflix() {
		System.out.println("Netflix details");
		
	}
	
}

public class interfacePgm1 {

	public static void main(String[] args) {
		
		tv t=new tv();
		t.volumeUp();
		t.volumeDown();
		t.netflix();
		t.youTube();
	}

}
