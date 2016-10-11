
public class Test {
	public int get(){
		try{
			return func1();
		}
		finally{
			
			return func2();
		}
	}
	int func1(){
		System.out.println("func1");
		return 1;
	}
	int func2(){
		System.out.println("func2");
		return 2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String org="fdk,1fd,gda,gdas,her,";
		String [] result = org.split(",");
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
			
		}
		String s1="a";
		String s2=s1+"b";
		String s3="a"+"b";
		System.out.println(s2=="ab");
		System.out.println(s3=="ab");
		
		int x=1;
		System.out.println(x++);
		System.out.println(x);
		x=1;
		System.out.println(++x);
		System.out.println(x);
		
		
		Test t = new Test();
		int b = t.get();
		System.out.println(b);
		
	}
	

}
