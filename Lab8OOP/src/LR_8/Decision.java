package LR_8;

public class Decision 
{
	public void FirstDecision(int x, int y, int n)
	{
		System.out.print("Answer according to the first formula: ");
		double k = -x/2.0;
		double X = 0.0;
		double Y = 0.0;
		double in = 6.0;
		double a = 4.0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				X = X - ((Math.pow(x, i)/in)*(Math.pow(p,i)));
			}
			if(i%2!=0)
			{
				Y = Y + ((Math.pow(y, i)/in)*(Math.pow(p,i)));
			}
			in = in * a;
			a+=1.0;
		}
		System.out.print(X + Y +k);
		
	}
	public void SecondDecision(int y, int x, int n)
	{
		System.out.print("\nAnswer according to the second formula: ");
		double answer=0.0;
		int y1=1;
		int x1=1;
		for(int i=1; i<=Math.max(y, x);i++) {
			
			answer+= ((Math.pow(x1,2)+Math.pow(y1,2))/(Math.pow(x1,3)-Math.pow(y1,3)));
			if(y1!=y) y1++;
			if(x1!=x) x1++;
		}
		
		System.out.print(answer);
	}
}
