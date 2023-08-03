package sample;
public class lettcode {

    public static void main(String[] args) throws InterruptedException {
    	
    	int [][] a= {{4,3,2,0,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
    	int count=0;
    	for(int i=0;i<a.length;i++)
    	{
    		for(int j=0;j<a[i].length;j++)
    		{
    			if(a[i][j]<0)
    			{
    				count++;
    			}
    			
    		}
    	}
    	System.out.println(count);
	}
}
