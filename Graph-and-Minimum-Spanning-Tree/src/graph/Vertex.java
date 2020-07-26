package graph;

/**
 *
 * @author Christiaan Bouwer - VVF6HCS19
 */
public class Vertex {
    public char label;
    public boolean visited;
    
    /**
     * Constructor to set the default values
     * @param label 
     */
    public Vertex(char label){
        this.label = label;
        visited = false;
    }
    
    /**
     * 
     * @return current char label
     */
    public char getLable(){
        return label;
    }
    
    /**
     * the char label to be set
     * @param label 
     */
    public void setLabel(char label){
        this.label = label;
    }
    
    /**
     * 
     * @return true or false depending on visited or not
     */
    public boolean isVisited() {
        return visited;
    }

}
