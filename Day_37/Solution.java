Question:- Given two binary max heaps as arrays, merge the given heaps to form a new max heap.

Example 1:-

Input  : 
n = 4 m = 3
a[] = {10, 5, 6, 2}, 
b[] = {12, 7, 9}
Output : 
{12, 10, 9, 2, 5, 7, 6}

time complexity is O(N)

class Solution{
    public int[] mergeHeaps(int[] a, int[] b, int n, int m) {
        int ans[] = new int[m+n];
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(a[i]);
        }
        for(int i=0;i<m;i++){
            arr.add(b[i]);
        }
        
        for(int i=0;i<arr.size();i++){
            ans[i] = arr.get(i);
        }
        int size = ans.length;
        for(int i=(size/2)-1;i>=0;i--){
            restoreDown(ans,i,ans.length);
        }
        return ans;
    }
    private static void restoreDown(int[] arr, int i,int size) {
		int lchild = (2*i)+1 , rchild = (2*i)+2;
		int num = arr[i];
		while(rchild<=size-1) {
			if(num>=arr[lchild] && num>=arr[rchild]) {
				arr[i] = num;
				return ;
			}else if(arr[lchild]>arr[rchild]) {
				arr[i] = arr[lchild];
				i = lchild;
			}else {
				arr[i] = arr[rchild];
				i = rchild;
			}
			lchild = (2*i)+1;
			rchild = (2*i)+2;
		}
		if(lchild==size-1 && num<arr[lchild]) {
			arr[i] = arr[lchild];
			i = lchild;
		}
		arr[i] = num;
	}
    
    
}