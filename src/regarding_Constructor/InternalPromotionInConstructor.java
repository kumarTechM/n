package regarding_Constructor;

public class InternalPromotionInConstructor
{
	InternalPromotionInConstructor()
	{
		System.out.println("0-arg Constructor");
	}
	InternalPromotionInConstructor(int a)
	{
		System.out.println("int Constructor");
	}
	InternalPromotionInConstructor(double e)
	{
		System.out.println(" double Constructor");
	}

	public static void main(String[] args) 
	{
		InternalPromotionInConstructor e=new  InternalPromotionInConstructor();
		InternalPromotionInConstructor e1=new  InternalPromotionInConstructor(10);
		InternalPromotionInConstructor e2=new  InternalPromotionInConstructor('a');//internal promotion
		InternalPromotionInConstructor e3=new  InternalPromotionInConstructor(10l);//internal promotion

	}

}
