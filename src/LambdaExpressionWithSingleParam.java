

import java.util.ArrayList;

public class LambdaExpressionWithSingleParam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.forEach(x->System.out.println(x*2));

	}

}
