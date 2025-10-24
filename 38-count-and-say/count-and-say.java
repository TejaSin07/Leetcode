class Solution {
    public String countAndSay(int n) {
        String ans = "1";
    
        int k = 1;
        while(k < n){
            
            ArrayList<ArrayList<Integer>> lst = getList(ans);
            ans = getString(lst);
            k++;
        }
        return ans;
    }

    private static String getString(ArrayList<ArrayList<Integer>> lst){
        StringBuilder sb = new StringBuilder();
        for (ArrayList <Integer> row : lst) { // Outer loop iterates through each inner List (row)
            for (Integer element : row) { // Inner loop iterates through each element in the current row
                char ch = (char)(element + '0');
                sb.append(ch);
            }// Move to the next line after processing each row
        }
        return sb.toString();
    }



    private static ArrayList<ArrayList<Integer>> getList(String str){
        
        ArrayList<ArrayList<Integer>> lst = new ArrayList<>();

        int[] intArray = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            intArray[i] = str.charAt(i) - '0';
        }
        int count = 1;
        for(int i = 1;i< intArray.length;i++){
            
            if(intArray[i]==intArray[i-1]){
                count++;
                continue;
            }

            ArrayList<Integer>temp = new ArrayList<>();
            temp.add(count);
            temp.add(intArray[i-1]);
            lst.add(temp);
            count = 1;
        }
            ArrayList<Integer>temp = new ArrayList<>();
            temp.add(count);
            temp.add(intArray[str.length()-1]);
            lst.add(temp);
            return lst;
    }
}