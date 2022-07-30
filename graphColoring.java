class solve {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    
    static boolean isSafeToPlaceColor(int node,int color[], boolean graph[][], int colour)
    {
        
        for(int i = 0; i<graph.length;i++)
        {
            if(graph[node][i])
            {
                if(color[i] == colour)
                return false;
            }
            
        }
        
        return true;
    }
    
    boolean isItPossibleToColorTheGraph(int node, int color[], boolean graph[][], int m, int n)
    {
        if(node == n)
        return true;
        
        for(int i=1; i<=m; i++)
        {
            if(isSafeToPlaceColor(node,color,graph,i))
            {
                color[node]=i;
                
                if(isItPossibleToColorTheGraph(node+1,color, graph, m,n))
                return true;
                
                color[node]=0;
            }
        }
        return false;
        
    }
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        
        int color[] = new int[n];
        
        return(isItPossibleToColorTheGraph(0,color,graph,m,n));
        
    }
}
