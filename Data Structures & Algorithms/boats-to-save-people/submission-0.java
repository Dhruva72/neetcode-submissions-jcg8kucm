class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats =0;
        int n =  people.length;
        for (int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = people[i]+people[j];
                if(sum>limit || people[i]>limit){
                boats++;
            }
            }
            
            
        }
        return boats;

    }
}