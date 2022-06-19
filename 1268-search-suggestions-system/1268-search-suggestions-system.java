class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        
        // lex sort array
        Arrays.sort(products);
        
        // create a map - linkedMap to preserve the order of insertion
        Map<String, List<String>> m = new LinkedHashMap<>();
        
        // iterate over each product
        for (String p : products){
            // iterate over each substring of the product
            for (int i = 0; i < p.length(); i++){
                m.putIfAbsent(p.substring(0, i + 1), new ArrayList<>());
                // add product in correspondence to the substring
                m.get(p.substring(0, i + 1)).add(p);
            }
        }
        
        // declare and init answer list
        List<List<String>> ans = new ArrayList<>();
        
        // iterate over each character of searchWord
        for(int i = 0; i < searchWord.length(); i++){
            // in case there is entry in map for the substring
            if (m.containsKey(searchWord.substring(0,i + 1))){
                // get all suggestions w.r.t the substring
                List<String> suggestions = m.get(searchWord.substring(0,i +1));
                // create new array
                List<String> sug = new ArrayList<>();
                // add first three 
                for (int j = 0; j < 3 && j < suggestions.size()  ; j++){
                    sug.add(suggestions.get(j));
                }    
                // add to answer
                ans.add(sug);
            } else {
                // add 0 list / blank list in case there is no match
                ans.add(new ArrayList<>());
            }            
        }
        
        // return 
        return ans;        
    }
}