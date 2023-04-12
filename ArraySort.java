package Arrays;

public class ArraySort2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]= {33,56,34,2,7,8};
		int temp=0;
		System.out.println("Original array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+"");
		}
		System.out.println();
		System.out.println("choose option: 1)Ascending 2)Descendin");
		
		int Choice= sc.nextInt();
		switch(Choice)
		{
		case 1:
			for(int i=0;i<a.length;i++) 
			{
				for(int j=i+1; j<a.length;j++)
				{
					if(a[i]>a[j])
					{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
			}
			System.out.println(":sorted array:(Descending)");
			for(int var: a)
			{
				System.out.print(var+" ");
			}
			System.out.println();
			break;
			
			default:
				System.out.println("Wrong Choice!!");
			
		}
		

	}

}
