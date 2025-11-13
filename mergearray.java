class mergearray{
     public static void main(String h[])
        {
           
	int[] arr1=new int[3];
	int[] arr2=new int[3];
	for(int i=0;i<3;i++){
	arr1[i]=Integer.parseInt(h[i]);
	}
	for(int i=0;i<3;i++){
	arr2[i]=Integer.parseInt(h[i+3]);
	}
	int[] merged=new int[arr1.length+arr2.length];
	for(int i=0;i<arr1.length;i++){
	merged[i]=arr1[i];
	}
	for(int i=0;i<arr2.length;i++){
	merged[i]=arr2[i];
	}
		System.out.println("merged array:");
		for(int n :merged){
		System.out.println(n+" ");
		}
	}
}
	