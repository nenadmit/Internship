  
public int brothersInTheBar(int[] glasses){
        
        if(glasses.length<=2)
            return 0;
        
        ArrayList<Integer> glassesAsList = new ArrayList<Integer>();
        Arrays.stream(glasses).forEach(i -> glassesAsList.add(i));

        int counter=0;
        for (int x=0;x<glassesAsList.size()-2;++x){
            
            if(glassesAsList.get(x) == glassesAsList.get(x+1) && glassesAsList.get(x) == glassesAsList.get(x+2)){
                glassesAsList.remove(x);
                glassesAsList.remove(x);
                glassesAsList.remove(x);
                counter++;
                x=-1;
            }
            if(glassesAsList.isEmpty())
                break;
        }
     return counter;
     }
    
    
  
    
           
