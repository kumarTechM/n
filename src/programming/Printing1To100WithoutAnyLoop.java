package programming;

public class Printing1To100WithoutAnyLoop 
{public static void getnumbers(int num)
{
	if(num<=100)
	{
		System.out.println(num);
		num++;
		getnumbers(num);
	}
}
public static void getnumbers1(int startnumer,int endnumber)
{
	if(startnumer<=endnumber)
	{
		System.out.println(startnumer);
		startnumer++;
		getnumbers1(startnumer,endnumber);
		
	}
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	getnumbers(1);
	getnumbers1(1,100);
}

}


