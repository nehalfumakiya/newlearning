package package1;

public class TestArrays {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=0;
		int ref;
		
        int [] index = new int[4];
        String [] island =  new String[4];
        
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
		
		
		island[0]= "Bermuda";
		island[1]= "Fiji";
		island[2]= "Azores";
		island[3]= "Cozumel";
		
		while(y<4)
		{
			ref= index[y];
			System.out.print("island=");
			System.out.println(island[ref]);
			y=y+1;
		}

	}

}
