public class Hulk {  
    public static String h(int no){
    	String feeling1 = "I hate";
        String feeling2 = "I love";
        String feeling = "";
        if(no == 1){
        	System.out.println( "I hate it" );
        } else{
        	for(int c = 1; c <= no; c++){
        		if(c%2 == 1){
        			feeling = feeling + feeling1;
        			if(c!=no){
        				feeling = feeling + " that ";
        			}
        		}else {
        			feeling = feeling + feeling2;
        			if(c!=no){
        				feeling = feeling + " that ";
        			}
        		}
        	}
        	feeling += " it";
        }
        return feeling;
    }
}
