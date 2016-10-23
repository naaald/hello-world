/**
 * @(#)MeetingOfOldFriends.java
 *
 *
 * @author 
 * @version 1.00 2016/10/22
 */
import java.util.*;
public class MeetingOfOldFriends {
public static void main(String[] args) {
    	Scanner kbd = new Scanner(System.in);
        String input = kbd.nextLine();
        String in[] = input.split(" ");
        long inpt[] = new long[in.length];
        for(int c = 0; c < in.length; c++){
			inpt[c] = Long.parseLong(in[c]);
        }
		long time = 0;
        if(inpt[2] < inpt[1]){
        	if(inpt[3] <= inpt[1] && inpt[2] >= inpt[0]){
        		time = inpt[3] - inpt[2] + 1;
        		if(inpt[4] <= inpt[3] && inpt[4] >= inpt[2]){
        			time -= 1;
        		}
        	}else if(inpt[3] <= inpt[1] && inpt[0] >= inpt[2]){
        		time = inpt[3] - inpt[0] + 1;
        		if(inpt[4] <= inpt[3] && inpt[4] >= inpt[0]){
        			time -= 1;
        		}
        	}else if(inpt[1] <= inpt[3] && inpt[2] >= inpt[0]){
        		time = inpt[1]-inpt[2] + 1;
        		if(inpt[4] <= inpt[1] && inpt[4] >= inpt[2]){
        			time -= 1;
        		}
        	}else if(inpt[1] <= inpt[3] && inpt[0] >= inpt[2]){
        		time = inpt[1]-inpt[0] + 1;
        		if(inpt[4] <= inpt[1] && inpt[4] >= inpt[0]){
        			time -= 1;
        		}
        	}
        }
        if((inpt[0] == inpt[1] && inpt[2] <= inpt[0] && inpt[3] >= inpt[1] && inpt[4] != inpt[0]) || (inpt[2] == inpt[3] && inpt[0] <= inpt[2] && inpt[1] >= inpt[3] && inpt[4] != inpt[2]) || (inpt[1] == inpt[2] && inpt[4] != inpt[2])){
        	time = 1;
        }
        if((inpt[1] == inpt[4] && inpt[0] == inpt[1]) || (inpt[2] == inpt[4] && inpt[2] == inpt[3]) || inpt[0] > inpt[3] || inpt[2] > inpt[1]){
        		
        		time = 0;
        	}
        System.out.println(time);
    }
}
