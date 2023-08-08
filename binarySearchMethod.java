public static void binarys(int ar[],int val){
        int lo=0;
        int hi=ar.length;

        while (hi>lo){
            int mid= lo + (hi-lo)/2;
            if (ar[mid]==val){
                System.out.println("Element found at index : "+mid);
                return;
            }
            if (val<ar[mid]){
                hi=mid-1;
            }else {
                lo=mid+1;
            }
            if (hi<lo)
                System.out.println("Element not found");
        }
    }
