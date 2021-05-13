class Solution{
	public int[] merge(int arr1[],int arr2[]){
		int n1 = arr1.length;
		int n2 = arr2.length;
		int i=0,j=0,k=0;
		int res[] = new int[n1+n2];

		while(i<n1&&j<n2){
			if(arr1[i]>arr2[j]){
				res[k] = arr2[j];
				j++;
			}
			else{
				res[k] = arr1[i];
				i++;
			}
			k++;
		}
		while(i<n1){
			res[k] = arr1[i];
			i++;
			k++;
		}
		while(j<n2){
			res[k] = arr2[j];
			j++;
			k++;
		}
		return res;
	}
}
